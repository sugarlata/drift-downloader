import datetime
from dataclasses import dataclass


@dataclass
class GhostFile:

    created_time: datetime.datetime
    filename: str
    size: int
