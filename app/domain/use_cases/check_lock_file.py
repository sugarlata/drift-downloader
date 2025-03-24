from app.data.data_sources.file_io import FileIODataSource


class CheckLockFile:
    def __init__(self):
        self._file_io_data_source = FileIODataSource

    def execute(self):
        return self._file_io_data_source.lock_file_exists()