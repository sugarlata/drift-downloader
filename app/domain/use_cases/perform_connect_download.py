from app.data.data_sources.home_api import HomeAPI
from app.domain.use_cases.connect_ghost import connect_ghost
from app.domain.use_cases.connect_normal import connect_normal
from app.domain.use_cases.download_files import download_files
from app.domain.use_cases.get_file_list import get_file_list


def perform_connect_download():

    try:
        connect_ghost()
    except RuntimeError as e:
        return

    try:
        file_list = get_file_list()
    except Exception as e:
        HomeAPI.send_message(
            title="Ghost Downloader",
            message=f"Could not get file list ({e})",
        )
        return

    if file_list:
        HomeAPI.send_message(
            title="Ghost Downloader",
            message="Drift Downloader has started downloading files... Do not plug in the Ghost",
        )

    try:
        download_files(file_list)
    except Exception as e:
        HomeAPI.send_message(
            title="Ghost Downloader",
            message=f"Could not download files ({e})",
        )
        return

    if file_list:
        HomeAPI.send_message(
            title="Ghost Downloader",
            message="Drift Downloader has finished downloading files",
        )

    try:
        connect_normal()
    except Exception as e:
        HomeAPI.send_message(
            title="Ghost Downloader",
            message=f"Could not connect back to normal network ({e})",
        )
        return
