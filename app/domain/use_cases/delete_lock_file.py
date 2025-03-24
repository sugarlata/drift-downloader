from app.data.data_sources.file_io import FileIODataSource


class DeleteLockFile:
    def __init__(self):
        self._file_io_data_source = FileIODataSource

    def execute(self):
        self._file_io_data_source.delete_lock_file()