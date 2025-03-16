import winwifi

from loguru import logger


class WinAPManager:

    def connect(ssid: str):

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
