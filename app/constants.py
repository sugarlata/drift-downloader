import os
from dotenv import load_dotenv

load_dotenv()


LOCAL_FILES_LOCATION = os.getenv("LOCAL_FILES_LOCATION")
GHOST_WIFI_AP = os.getenv("GHOST_WIFI_AP")
NORMAL_WIFI_AP = os.getenv("NORMAL_WIFI_AP")
