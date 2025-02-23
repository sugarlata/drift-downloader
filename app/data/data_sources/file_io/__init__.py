import os


class FileIO:

    def get_local_file_size(path: str) -> int:

        return os.path.getsize(path)
