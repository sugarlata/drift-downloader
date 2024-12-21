Drift Downloader
================

This project will enable automatic downloading of videos from a drift device.

1. Endpoints related to drift control can be found in BossDefine.java - this is from the [Drift SDK](https://us.driftinnovation.com/blogs/news/drift-link-a-brand-new-open-source-app-for-android)
2. Use the following endpoints:

**Get all files (assuming folder is 100MEDIA**

```
http://192.168.42.1/cgi-bin/foream_remote_control?list_files=/tmp/SD0/DCIM/100MEDIA
```

**Download a file**

```
http://192.168.42.1/DCIM/100MEDIA/VID00019.MP4
```
