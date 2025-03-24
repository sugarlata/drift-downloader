!#/bin/bash
export PYTHONPATH=$PYTHONPATH:/usr/local/src/nathan-source/drift-downloader
cd /usr/local/src/nathan-source/drift-downloader
uv run app/main.py >> /var/log/drift-downloader.log