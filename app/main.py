from app.domain.use_cases.check_lock_file import CheckLockFile
from app.domain.use_cases.create_lock_file import CreateLockFile
from app.domain.use_cases.delete_lock_file import DeleteLockFile
from app.domain.use_cases.download_files import download_files
from app.domain.use_cases.connect_normal import connect_normal
from app.domain.use_cases.connect_ghost import connect_ghost
from app.domain.use_cases.get_file_list import get_file_list


def main():

    if CheckLockFile().execute():
        return
    else:
        CreateLockFile().execute()

    try:
        connect_ghost()
    except RuntimeError:
        return

    file_list = get_file_list()
    download_files(file_list)

    try:
        connect_normal()
    except RuntimeError:
        return

    DeleteLockFile().execute()


if __name__ == "__main__":
    main()
