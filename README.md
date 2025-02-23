Drift Downloader
================

This project will enable automatic downloading of videos from a drift device.

# Structure

The repo is in a clean architecture structure (stripped back the domain/repo level to avoid over-engineering) 

# Running the script

Currently script only supports Windows.

Ensure you have a .env file with the following:

```
LOCAL_FILES_LOCATION=
GHOST_WIFI_AP=""
NORMAL_WIFI_APP=""
```

Run the script:

`uv run app/main.py`

Script will:

1. Get list of video files
2. Download each file
3. Validate matching file size
4. If local file is now valid, delete on the Ghost XL.

# References

See `BossDefine.java`, this is from the Android app and contains constants for API calls on the Ghost XL.

Alternatively, other documentation can be found in the [Drift SDK](https://us.driftinnovation.com/blogs/news/drift-link-a-brand-new-open-source-app-for-android)
