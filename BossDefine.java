package com.drift.foreamlib.boss.model;

public class BossDefine {
	public static String SERVER_IP = "http://192.168.42.1";

	// rtsp stream URL
	public final static String RTSP_STREAM = "rtsp://192.168.42.1/AmbaStreamTest";// "http://192.168.42.1/live/amba.m3u8";//
	// rtsp://192.168.42.1/AmbaStreamTest
	// DLNA file path
	public final static String BIGIMG_IP = SERVER_IP + ":8200/MediaItems/";

	// ɾ���ļ�
	public final static String DELIMG_IP = SERVER_IP + ":8200/DeleteMedia/";

	// SD card file path
	public final static String FILE_PATH = SERVER_IP + "/DCIM/";

	public final static String URL_BASIC = SERVER_IP
			+ "/setting/cgi-bin/fd_control_client?func=";

	//add stream control for local network.
	public final static String LOCAL_START_STREAM_WITH_URL = "http://%s/cgi-bin/foream_remote_control?start_rtmp_with_param=%s&stream_res=%s&stream_bitrate=%s";
	public final static String LOCAL_START_STREAM = "http://%s/cgi-bin/foream_remote_control?start_rtmp";
	public final static String LOCAL_STOP_STREAM = "http://%s/cgi-bin/foream_remote_control?stop_rtmp";

	public final static String LOCAL_SETTING_ZOOM = "http://%s/cgi-bin/foream_remote_control?dzoom=%s";
	public final static String LOCAL_SETTING_EXPOSURE = "http://%s/cgi-bin/foream_remote_control?exposure=%s";
	public final static String LOCAL_SETTING_BITRATE = "http://%s/cgi-bin/foream_remote_control?stream_bitrate=%s";
	public final static String LOCAL_SETTING_FILTERS = "http://%s/cgi-bin/foream_remote_control?filter=%s";
	public final static String LOCAL_SETTING_RESOLUTION = "http://%s/cgi-bin/foream_remote_control?stream_res=%s";
	public final static String LOCAL_SETTING_STREAM_FRAMERATE = "http://%s/cgi-bin/foream_remote_control?stream_framerate=%s";
	public final static String LOCAL_SETTING_VIDEO_RESOLUTION = "http://%s/cgi-bin/foream_remote_control?video_resolution=%s";
	public final static String LOCAL_SETTING_VIDEO_FRAMERATE = "http://%s/cgi-bin/foream_remote_control?video_framerate=%s";
	public final static String LOCAL_SETTING_VIDEO_BITRATE = "http://%s/cgi-bin/foream_remote_control?video_bitrate=%s";
	public final static String LOCAL_REBOOT = "http://%s/cgi-bin/foream_remote_control?reboot";
	public final static String LOCAL_SHUTDOWN = "http://%s/cgi-bin/foream_remote_control?power_off";
	public final static String LOCAL_SETTIME = "http://%s/cgi-bin/foream_remote_control?set_time=%s";
	public final static String LOCAL_GETCAMSETTING = "http://%s/cgi-bin/foream_remote_control?get_camera_setting";
	public final static String LOCAL_GETCAMSTATUS = "http://%s/cgi-bin/foream_remote_control?get_camera_status";
	public final static String LOCAL_START_RECORD = "http://%s/cgi-bin/foream_remote_control?start_record";
	public final static String LOCAL_STOP_RECORD = "http://%s/cgi-bin/foream_remote_control?stop_record";
	public final static String LOCAL_SET_LED = "http://%s/cgi-bin/foream_remote_control?led=%s";
	public final static String LOCAL_SETTING_MIC_SENSITIVITY = "http://%s/cgi-bin/foream_remote_control?mic_sensitivity=%s";
	public final static String LOCAL_LIST_FOLDERS = "http://%s/cgi-bin/foream_remote_control?list_folders=/tmp/SD0/DCIM";
	public final static String LOCAL_LIST_FILES = "http://%s/cgi-bin/foream_remote_control?list_files=/tmp/SD0/DCIM/%s";
	public final static String LOCAL_DEL_FILES = "http://%s/cgi-bin/foream_remote_control?delete_media_file=%s";

//	public final static String WIFI_MODE_AP_WITH_PWD = URL_BASIC
//			+ "fd_set_wifi_mode_ap&ssid=%s&security=1&password=%s";

	public final static int RES_SUCCESS = 1;
	public final static int RES_FAIL = 0;
	// ��ȡ�����Ϣ
	public final static String GET_CAMERA_INFO = URL_BASIC
			+ "fd_get_camera_info";
	// ¼��
	public final static String RECORD = URL_BASIC + "fd_record";
	// ¼��2
	public final static int FD_RECORD_STOP_RECORDING = 0;
	public final static int FD_RECORD_START_RECORDING = 1;
	public final static int FD_RECORD_TAKING_PHOTO = 2;
	public final static String RECORD_2 = URL_BASIC + "fd_record_2&data=";
	// ����Mode
	public final static int FD_CAPTURE_MODE_VIDEO = 0;
	public final static int FD_CAPTURE_MODE_PHOTO = 1;
	public final static int FD_CAPTURE_MODE_TIMELAPSE = 2;
	public final static int FD_CAPTURE_MODE_PHOTOBURST = 3;
	public final static String URL_MODE_SET = URL_BASIC
			+ "fd_set_capture_mode&data=";
	// Zoom
	public final static int FD_ZOOM_MAX_VALUE = 9;
	public final static String ZOOM = URL_BASIC + "fd_dzoom&data=";
	// Video Resolution
	public final static int FD_VIDEO_RES_720P = 0;
	public final static int FD_VIDEO_RES_1080P = 1;
	public final static int FD_VIDEO_RES_WVGA = 3;
	public final static String VIDEO_RES = URL_BASIC + "fd_set_video_res&data=";
	// Video Frame
	public final static String VIDEO_FRAME = URL_BASIC
			+ "fd_set_video_framerate";

	public final static String VIDEO_FOV = URL_BASIC + "fd_set_video_fov";

	public final static String ANTI_FLICKER = URL_BASIC
			+ "fd_set_video_anti_flicker";

	public final static int FD_PHOTO_RES_12M = 0;
	public final static int FD_PHOTO_RES_5M = 1;
	public final static int FD_PHOTO_RES_3M = 2;
	public final static int FD_PHOTO_RES_COUNT = 3;
	public final static String PHOTO_RES = URL_BASIC + "fd_set_photo_res&data=";

	public final static String PHOTO_CONTINUE_SHOOT = URL_BASIC
			+ "fd_set_photo_continue_shooting";

	public final static String PHOTO_AE = URL_BASIC + "fd_set_photo_ae";

	public final static String WHITE_BALANCE = URL_BASIC + "fd_set_photo_wb";

	public final static String CONTRAST = URL_BASIC + "fd_set_photo_contrast";

	public final static String SELF_TIMER = URL_BASIC
			+ "fd_set_photo_self_timer";

	public final static String MIC_SENSITIVITY = URL_BASIC
			+ "fd_set_mic_sensitivity";
	//
	public final static String CAMERA_OFF = URL_BASIC + "fd_set_camera_off";
	// �ָ�Ĭ������
	public final static String RESTORE_DEFAULT_SETTINGS = URL_BASIC
			+ "fd_restore_default_setting&data=0";
	// ��������ͷ���
	public final static String SET_CAMERA_NAME = URL_BASIC
			+ "fd_set_camera_name";
	// ��������ͷ
	public final static String REBOOT_CAMERA = URL_BASIC + "fd_reboot_camera";
	// ��ȡ����ͷ������Ϣ
	public final static String GET_CAMERA_STATUS = URL_BASIC
			+ "fd_get_camera_status";
	// this api is for new version DV
	public final static String GET_CAMERA_STATUS_2 = URL_BASIC
			+ "fd_get_camera_status_2";

	public final static String GET_CAMERA_SETTING_2 = URL_BASIC
			+ "fd_get_camera_setting";

	public final static String GET_VIDEO_SETTING = URL_BASIC
			+ "fd_get_video_setting";

	public final static String GET_PHOTO_SETTING = URL_BASIC
			+ "fd_get_photo_setting";

	public final static String GET_TIMELAPSE_SETTING = URL_BASIC
			+ "fd_get_timelapse_setting";

	public final static String GET_BURST_SETTING = URL_BASIC
			+ "fd_get_photoburst_setting";

	// ����WIFI��ģʽ
	public final static String WIFI_MODE_AP = URL_BASIC
			+ "fd_set_wifi_mode_ap&ssid=%s&security=0";
	public final static String WIFI_MODE_AP_WITH_PWD = URL_BASIC
			+ "fd_set_wifi_mode_ap&ssid=%s&security=1&password=%s";
	// Stationģʽ
	public final static String WIFI_MODE_STATION = URL_BASIC
			+ "fd_set_wifi_mode_station";
	// ����ʱ��
	public final static String SET_DATE_TME = URL_BASIC + "fd_set_time";
	// ���ÿͻ���
	public final static String WIFI_CLIENT = URL_BASIC + "fd_set_wifi_client";
	// ��ȡ��ص���
	public final static String GET_BATTERY = URL_BASIC
			+ "fd_get_camera_battery";
	// �ļ�ɾ��
	public final static String FILE_DEL = URL_BASIC
			+ "fd_del_media_file&type=%d&name=%s";
	// ��ȡ¼��״̬
	public final static String GET_CAMERA_STATES = URL_BASIC
			+ "fd_get_record_status";
	// ����shoot����״̬
	public final static String ENTER_SHOOT = URL_BASIC + "fd_send_app_status";
	// set car DV rotating
	public final static String ROTATING = URL_BASIC + "fd_set_video_rotation";
	// set car DV mode
	public final static String CAR_DV = URL_BASIC + "fd_enable_cardv";
	// set LED Indicator
	public final static String LED_INDICATOR = URL_BASIC
			+ "fd_enable_led_indicator";
	// set Beep
	public final static String BEEP = URL_BASIC + "fd_enable_beep";
	// get car DV setting status
	public final static String CAR_DV_SETTING = URL_BASIC
			+ "fd_get_cardv_setting";

	// get record status
	public final static String GET_RECORD_STATUS = URL_BASIC
			+ "fd_get_record_status";

	// get record status 2
	public final static String GET_RECORD_STATUS2 = URL_BASIC
			+ "fd_get_record_status_2";

	// set DLNA enable.
	public final static int FD_DISABLE_DLNA = 0;
	public final static int FD_ENABLE_DLNA = 1;
	public final static String ENABLE_DLNA = URL_BASIC + "fd_enable_dlna&data=";

	// get latest media file
	public final static int FD_MEDIA_VIDEO = 0;
	public final static int FD_MEDIA_PHOTO = 1;
	public final static String GET_LATEST_MEDIA = URL_BASIC
			+ "fd_get_latest_media_file&type=";

	// reset stream for reduce delay
	public final static String RESET_STREAM = URL_BASIC
			+ "fd_reset_stream&data=0";

	public final static String SET_STREAM_BITRATE = URL_BASIC
			+ "fd_set_stream_bitrate&data=";

	public final static String SET_STREAM_RES = URL_BASIC
			+ "fd_set_stream_resolution&data=%d";
	// set stream mode
	public final static int FD_RTSP_STREAM_WQVGA_30 = 0;
	public final static int FD_RTSP_STREAM_WVGA_15 = 1;
	public final static int FD_RTSP_STREAM_WVGA_30 = 2;
	public final static int FD_RTSP_STREAM_MODE_NUM = 3;
	public final static String SET_STREAM_MODE = URL_BASIC
			+ "fd_set_stream_mode&data=";

	public final static String SET_STREAM_GOP = URL_BASIC
			+ "fd_set_stream_gop&data=";

	// get camera video resolution capacity with WIFI on.
	public final static String GET_CAMERA_CAPACITY = URL_BASIC
			+ "fd_get_camera_capacity";

	// format SD card
	public final static String FORMAT_SD_CARD = URL_BASIC
			+ "fd_format_sd_card&data=0";

	// set stream config
	// int resolution
	public final static int FD_STREAM_RES_WQVGA = 0;
	public final static int FD_STREAM_RES_QVGA = 1;
	public final static int FD_STREAM_RES_VGA = 2;
	public final static int FD_STREAM_RES_WVGA = 3;
	public final static int FD_STREAM_RES_720P = 4;
	public final static int FD_STREAM_RES_NUM = 5;

	// int framerate
	public final static int FD_STREAM_FPS_30 = 0;
	public final static int FD_STREAM_FPS_15 = 1;
	public final static int FD_STREAM_FPS_10 = 2;
	public final static int FD_STREAM_FPS_6 = 3;
	public final static int FD_STREAM_FPS_5 = 4;
	public final static int FD_STREAM_FPS_3 = 5;
	public final static int FD_STREAM_FPS_NUM = 6;
	// set stream gop
	public final static int FD_STREAM_GOP_8 = 0;
	public final static int FD_STREAM_GOP_16 = 1;
	public final static int FD_STREAM_GOP_32 = 2;
	public final static int FD_STREAM_GOP_NUM = 3;
	// set stream bit rate
	public final static int FD_STREAM_BITRATE_0_4 = 0;
	public final static int FD_STREAM_BITRATE_0_3 = 1;
	public final static int FD_STREAM_BITRATE_0_5 = 2;
	public final static int FD_STREAM_BITRATE_0_6 = 3;
	public final static int FD_STREAM_BITRATE_0_8 = 4;
	public final static int FD_STREAM_BITRATE_1 = 5;
	public final static int FD_STREAM_BITRATE_2 = 6;
	public final static int FD_STREAM_BITRATE_3 = 7;
	public final static int FD_STREAM_BITRATE_5 = 8;
	public final static int FD_STREAM_BITRATE_NUM = 8;

	public final static String SET_STREAM_ENCODE_CONFIG = URL_BASIC
			+ "fd_set_stream_encode_config&resolution=%d&framerate=%d&bitrate=%d&gop=%d";
	public final static String GET_CAMERA_REGISTER_INFO = URL_BASIC
			+ "fd_get_camera_register_info";
	public final static String GET_CAMERA_SELF_REGISTER_INFO = URL_BASIC
			+ "fd_get_camera_self_register_info";
	public final static String SET_CAMERA_REGISTER_INFO = URL_BASIC
			+ "fd_set_camera_register_info&dev_name=%s&camera_key=%s&server_url=%s&ssid=%s&security=%d&password=%s";
	// fd_set_camera_self_register_info
	public final static String SET_CAMERA_SELF_REGISTER_INFO = URL_BASIC
			+ "fd_set_camera_self_register_info&uid=%s&utoken=%s&server_url=%s&ssid=%s&password=%s";
	public final static String SET_CAMERA_UPGRADE_ZIP = URL_BASIC
			+ "fd_start_fw_upgrade&name=%s&zipsize=%s&unzipsize=%s";
	public final static int FD_WIFI_MODE_AP = 0;
	public final static int FD_WIFI_MODE_STATION = 1;
	public final static String SWITCH_WIFI_MDOE = URL_BASIC
			+ "fd_switch_wifi_mode&data=%d";
	public final static String ENABLE_DIRECT_CLOUD = URL_BASIC
			+ "fd_enable_direct_cloud&data=%d";
	public final static String ENABLE_DIRECT_STREAMING = URL_BASIC
			+ "fd_enable_direct_streaming&data=%d";
	public final static String GET_CAMERA_STATUS_CLOUD = URL_BASIC
			+ "fd_get_camera_status_cloud";
	public final static String GET_RECORD_STATUS_CLOUD = URL_BASIC
			+ "fd_get_record_status_cloud";
	public final static String SET_CAMERA_SETTING = URL_BASIC
			+ "fd_set_camera_setting";
	public final static String GET_CAMERA_SETTING = URL_BASIC
			+ "fd_get_camera_setting_cloud";
	public final static String SET_CAMERA_SETTING_1 = URL_BASIC
			+ "fd_set_camera_setting_1&setting=%s";
	public final static String DEL_MULTI_MEDIA_FILES = URL_BASIC
			+ "fd_del_media_files&files=%s";
	public final static String CLEAR_LAST_REGISTER_ERRNO_FLAG = URL_BASIC
			+ "fd_clear_last_register_errno_flag";
	public final static String GET_WIFI_ROUTER_LIST = URL_BASIC
			+ "fd_get_wifi_router_lists";
	public final static String SET_WIFI_ROUTER_LIST = URL_BASIC
			+ "fd_set_wifi_router_lists&setting=%s&mtime=%s";
	public final static String GET_CAMERA_UPDATE_STATUS = URL_BASIC
			+ "fd_get_camera_update_status";

	public final static String SET_AP_AUTO_START = URL_BASIC
			+ "fd_set_ap_auto_start";
	public final static String SET_SENSOR_KEY_SENSITIVITY = URL_BASIC
			+ "fd_set_sensor_key_sensitivity";

/*http://192.168.42.1/setting/cgi-bin/fd_control_client?func=fd_restore_default_setting&data=0
* */
	public final static String SET_CAMERA_SETTING_3 = URL_BASIC
			+ "%s&data=%s";

}
