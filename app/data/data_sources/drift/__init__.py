import json
import pytz
import datetime
import requests
import xmltodict

from loguru import logger

from app.data.models import GhostFile


class DriftConnection:

    BASE_URL = "http://192.168.42.1"
    GET_FILE_LIST = "/cgi-bin/foream_remote_control?list_files=/tmp/SD0/DCIM/100MEDIA"
    SET_TIME = "/cgi-bin/foream_remote_control?set_time="
    DOWNLOAD_FILE = "/DCIM/100MEDIA/"
    DELETE_FILE = (
        "/cgi-bin/foream_remote_control?delete_media_file=/tmp/SD0/DCIM/100MEDIA/"
    )
    MELBOURNE_TIMEZONE = pytz.timezone("Australia/Melbourne")
    CHUNK_SIZE = 8192 * 4

    @classmethod
    def get_file_list(cls) -> list[GhostFile]:

        logger.debug("Getting file list")
        resp_xml = requests.get(f"{cls.BASE_URL}{cls.GET_FILE_LIST}")

        resp_xml.raise_for_status()

        resp = xmltodict.parse(resp_xml.text)

        files_str = resp["Response"]["Files"]

        if not files_str:
            return []

        if files_str[-1] == ",":
            files_str = files_str[:-1]

        files = json.loads(f"[{files_str}]")

        return [
            GhostFile(
                created_time=cls.MELBOURNE_TIMEZONE.localize(
                    datetime.datetime.strptime(file["CreateTime"], "%b %d %H:%M:%S %Y")
                ),
                filename=file["Path"],
                size=file["Size"],
            )
            for file in files
        ]

    @classmethod
    def get_file(cls, file: GhostFile, local_path: str):

        download_url = f"{cls.BASE_URL}{cls.DOWNLOAD_FILE}{file.filename}"

        with requests.get(download_url, stream=True) as r:
            r.raise_for_status()

            completion = 0
            with open(local_path, "wb") as f:
                for chunk in r.iter_content(chunk_size=cls.CHUNK_SIZE):
                    f.write(chunk)
                    completion += cls.CHUNK_SIZE
                    logger.debug(
                        f"Getting {file.filename}: {round(100 * completion/float(file.size),3):.3f}%"
                    )

    @classmethod
    def delete_file(cls, file: GhostFile):

        delete_url = f"{cls.BASE_URL}{cls.DELETE_FILE}{file.filename}"
        requests.get(delete_url)

    @classmethod
    def update_time(cls):

        dt = datetime.datetime.now().strftime("%Y-%m-%d %H:%M:%S")
        set_time_url = f"{cls.BASE_URL}{cls.SET_TIME}{dt}"
        response = requests.get(set_time_url)
        response.raise_for_status()
