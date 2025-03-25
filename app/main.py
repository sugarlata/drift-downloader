from loguru import logger

from app.domain.use_cases.perform_connect_download import perform_connect_download
from app.domain.use_cases.check_lock_file import CheckLockFile
from app.domain.use_cases.create_lock_file import CreateLockFile
from app.domain.use_cases.delete_lock_file import DeleteLockFile
from app.domain.use_cases.download_files import download_files
from app.domain.use_cases.connect_normal import connect_normal
from app.domain.use_cases.connect_ghost import connect_ghost
from app.domain.use_cases.get_file_list import get_file_list


def main():

    logger.info("Starting Check Download")

    if CheckLockFile().execute():
        logger.debug("Lock file exists")
        return
    else:
        CreateLockFile().execute()

    try:
        logger.debug("Performing Connect and Download")
        perform_connect_download()
    except Exception as e:
        logger.exception(e)

    logger.debug("Deleting Lock File")
    DeleteLockFile().execute()

    logger.info("Finished Check Download")


if __name__ == "__main__":
    main()
