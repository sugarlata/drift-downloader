import sys

from app.constants import GHOST_WIFI_SSID, NORMAL_WIFI_SSID


class APManager(object):

    def __init__(self):

        if sys.platform == "win32":
            from app.data.data_sources.ap_win import WinAPManager

            self._ap_manager = WinAPManager

        elif sys.platform == "linux":
            from app.data.data_sources.ap_linux import LinuxAPManager

            self._ap_manager = LinuxAPManager

    def connect_ghost(self):
        self._ap_manager.connect(GHOST_WIFI_SSID)

    def connect_normal(self):
        self._ap_manager.connect(NORMAL_WIFI_SSID)
