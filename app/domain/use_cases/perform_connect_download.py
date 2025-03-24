from app.data.data_sources.home_api import HomeAPI
from app.domain.use_cases.connect_ghost import connect_ghost
from app.domain.use_cases.connect_normal import connect_normal
from app.domain.use_cases.download_files import download_files
from app.domain.use_cases.get_file_list import get_file_list


def perform_connect_download():

    try:
        HomeAPI.send_message(
            title="Ghost Downloader",
            message="Starting to Download from the Ghost",
        )
    except Exception as e:
        print(f"Error sending message: {e}")
        return

    HomeAPI.send_message(
        title="Ghost Downloader",
        message="Connecting to the Ghost",
    )

    try:
        connect_ghost()
    except RuntimeError as e:
        HomeAPI.send_message(
            title="Ghost Downloader",
            message=f"Could not connect to the Ghost ({e})",
        )
        return

    HomeAPI.send_message(
        title="Ghost Downloader",
        message="Connected to the Ghost",
    )
    HomeAPI.send_message(
        title="Ghost Downloader",
        message="Getting File List",
    )
    try:
        file_list = get_file_list()
    except Exception as e:
        HomeAPI.send_message(
            title="Ghost Downloader",
            message=f"Could not get file list ({e})",
        )
        return

    HomeAPI.send_message(
        title="Ghost Downloader",
        message="Downloading Files",
    )
    try:
        download_files(file_list)
    except Exception as e:
        HomeAPI.send_message(
            title="Ghost Downloader",
            message=f"Could not download files ({e})",
        )
        return

    HomeAPI.send_message(
        title="Ghost Downloader",
        message="Connecting back to Normal Network",
    )
    try:
        connect_normal()
    except Exception as e:
        HomeAPI.send_message(
            title="Ghost Downloader",
            message=f"Could not connect back to normal network ({e})",
        )
        return
