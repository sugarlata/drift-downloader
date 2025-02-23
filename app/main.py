from app.domain.use_cases.download_files import download_files
from app.domain.use_cases.connect_normal import connect_normal
from app.domain.use_cases.connect_ghost import connect_ghost
from app.domain.use_cases.get_file_list import get_file_list


def main():

    try:
        connect_ghost()
    except RuntimeError:
        return

    file_list = get_file_list()
    download_files(file_list)

    try:
        connect_normal()
    except RuntimeError:
        return


if __name__ == "__main__":
    main()
