import os

from app.constants import LOCAL_FILES_LOCATION
from app.data.data_sources.drift import DriftConnection
from app.data.data_sources.file_io import FileIO
from app.data.models import GhostFile


def download_files(file_list: list[GhostFile]):
    for file in file_list:

        local_filename = (
            f"{file.created_time.strftime('%y-%m-%d_%H-%M')}_{file.filename}"
        )
        local_file_path = os.path.join(LOCAL_FILES_LOCATION, local_filename)

        DriftConnection.get_file(file, local_file_path)

        local_file_size = FileIO.get_local_file_size(local_file_path)

        if local_file_size == file.size:
            DriftConnection.delete_file(file)
