from app.data.data_sources.drift import DriftConnection


def update_time() -> None:
    DriftConnection.update_time()
