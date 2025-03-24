import requests

from .models import NotificationTelegramSendRequest


class HomeAPI:

    @staticmethod
    def send_message(title: str, message: str):

        response = requests.post(
            "http://192.168.5.250:10000/notifications/telegram/send",
            json=NotificationTelegramSendRequest(
                title=title,
                message=message,
            ).model_dump_json(),
        )
        response.raise_for_status()
