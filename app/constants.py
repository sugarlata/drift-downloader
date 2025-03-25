import os
from dotenv import load_dotenv

load_dotenv("/etc/nathan/drift-downloader.env")


LOCAL_FILES_LOCATION = os.getenv("LOCAL_FILES_LOCATION")
GHOST_WIFI_SSID = os.getenv("GHOST_WIFI_AP")
NORMAL_WIFI_SSID = os.getenv("NORMAL_WIFI_AP")
