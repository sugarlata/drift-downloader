import requests

from .models import NotificationTelegramSendRequest


class HomeAPI:

    @staticmethod
    def send_message(title: str, message: str):

        json_body = NotificationTelegramSendRequest(
            title=title,
            message=message,
        ).model_dump()

        response = requests.post(
            "http://192.168.5.250:10000/notifications/telegram/send",
            json=json_body,
        )
        response.raise_for_status()
