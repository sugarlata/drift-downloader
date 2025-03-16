import time
import subprocess

from loguru import logger


class LinuxAPManager:

    @classmethod
    def connect(cls, ssid: str):

        logger.debug("Scanning for networks...")
        subprocess.run(["nmcli", "device", "wifi", "rescan"], capture_output=True)

        time.sleep(5)

        logger.debug(f"Connecting to {ssid}...")
        resp = subprocess.run(
            ["nmcli", "device", "wifi", "connect", f"{ssid}"], capture_output=True
        )
        if resp.returncode != 0:
            logger.error(f"Could not connect to {ssid} ({resp.stderr.decode()})")
            raise RuntimeError(f"Could not connect to {ssid} ({resp.stderr.decode()})")

        logger.debug(f"Connected to {ssid} ({resp.stdout.decode()})")
