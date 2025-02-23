import winwifi

from loguru import logger

from app.constants import GHOST_WIFI_AP, NORMAL_WIFI_AP


class APManager:

    def _connect(ssid: str):

        connected_ssid = winwifi.WinWiFi.get_connected_interfaces()[0].ssid

        if ssid == connected_ssid:
            return

        logger.debug(f"Connecting to {ssid}")
        try:
            winwifi.WinWiFi.connect(ssid)
        except RuntimeError as e:
            logger.error(f"Could not connect to {ssid} ({e})")
            raise e

        logger.debug(f"Completed Connection to {ssid}")

    @classmethod
    def connect_ghost(cls):
        cls._connect(GHOST_WIFI_AP)

    @classmethod
    def connect_normal(cls):
        cls._connect(NORMAL_WIFI_AP)
