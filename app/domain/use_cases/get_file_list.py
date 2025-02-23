import xmltodict

from app.data.data_sources.drift import DriftConnection
from app.data.models import GhostFile


def get_file_list() -> list[GhostFile]:
    return DriftConnection.get_file_list()
