#!/bin/bash
export PYTHONPATH=$PYTHONPATH:/usr/local/src/nathan-source/drift-downloader
touch /var/log/drift-downloader.log
cd /usr/local/src/nathan-source/drift-downloader
echo "" >> /var/log/drift-downloader.log
echo "Starting Drift Downloader $(date)" >> /var/log/drift-downloader.log
/home/nathan/.local/bin/uv sync >> /var/log/drift-downloader.log
/home/nathan/.local/bin/uv run app/main.py >> /var/log/drift-downloader.log
echo "Drift Downloader stopped $(date)" >> /var/log/drift-downloader.log

