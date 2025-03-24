#!/bin/bash
export PYTHONPATH=$PYTHONPATH:/usr/local/src/nathan-source/drift-downloader
touch /var/log/drift-downloader.log
cd /usr/local/src/nathan-source/drift-downloader
echo "Starting Drift Downloader $(date)" >> /var/log/drift-downloader.log
uv sync >> /var/log/drift-downloader.log
uv run app/main.py >> /var/log/drift-downloader.log
echo "Drift Downloader stopped $(date)" >> /var/log/drift-downloader.log
