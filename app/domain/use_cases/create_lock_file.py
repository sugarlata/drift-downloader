from app.data.data_sources.file_io import FileIODataSource


class CreateLockFile:
    def __init__(self):
        self._file_io_data_source = FileIODataSource

    def execute(self):
        self._file_io_data_source.create_lock_file()