import os

LOCK_FILE_LOCATION = "/var/lock/drift_download.lock"


class FileIODataSource:

    @staticmethod
    def get_local_file_size(path: str) -> int:

        return os.path.getsize(path)

    @staticmethod
    def create_lock_file() -> None:

        with open(LOCK_FILE_LOCATION, "w") as f:
            f.write("")

    @staticmethod
    def delete_lock_file() -> None:

        os.remove(LOCK_FILE_LOCATION)

    @staticmethod
    def lock_file_exists() -> bool:

        return os.path.exists(LOCK_FILE_LOCATION)
