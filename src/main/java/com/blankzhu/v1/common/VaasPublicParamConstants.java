package com.blankzhu.v1.common;

public class VaasPublicParamConstants {
    public static final String CT_VAAS_API_URL = "https://vaasapi.ctyun.cn";

    public static final String HOST_HEADER = "Host";
    public static final String ACTION_HEADER = "Action";
    public static final String VERSION_HEADER = "Version";
    public static final String TIMESTAMP_HEADER = "Timestamp";
    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final String CONTENT_TYPE_HEADER = "Content-Type";
    public static final String VERSION_VALUE = "2021-11-25";
    public static final String CONTENT_TYPE_VALUE = "application/json; charset=utf-8";

    public static final String CT_VAAS_SIGN_ALGORITHM = "CT-HMAC-SHA256";
    public static final String CT_VAAS_PRODUCT_NAME = "vaas";
    public static final String CT_VAAS_CANONICAL_URI = "/";
    public static final String YEAR_MONTH_DATE_FORMAT = "yyyy-MM-dd";

    public static final String CT_VAAS_ACTION_CREATE_DEVICE = "CreateDevice";
    public static final String CT_VAAS_ACTION_CREATE_DEVICES = "CreateDevices";
    public static final String CT_VAAS_ACTION_DELETE_DEVICE = "DeleteDevice";
    public static final String CT_VAAS_ACTION_DELETE_DEVICES = "DeleteDevices";
    public static final String CT_VAAS_ACTION_DESCRIBE_DEVICE = "DescribeDevice";
    public static final String CT_VAAS_ACTION_DESCRIBE_DEVICE_STATUS = "DescribeDeviceStatus";
    public static final String CT_VAAS_ACTION_DESCRIBE_DEVICE_STATUS_LIST = "DescribeDeviceStatusList";
    public static final String CT_VAAS_ACTION_START_DEVICE_PLAY = "StartDevicePlay";
    public static final String CT_VAAS_ACTION_BATCH_START_DEVICE_PLAY = "BatchStartDevicePlay";
    public static final String CT_VAAS_ACTION_STOP_DEVICE_PLAY = "StopDevicePlay";
    public static final String CT_VAAS_ACTION_BATCH_STOP_DEVICE_PLAY = "BatchStopDevicePlay";
    public static final String CT_VAAS_ACTION_START_DEVICE_PLAYBACK = "StartDevicePlayback";
    public static final String CT_VAAS_ACTION_BATCH_START_DEVICE_PLAYBACK = "BatchStartDevicePlayback";
    public static final String CT_VAAS_ACTION_STOP_DEVICE_PLAYBACK = "StopDevicePlayback";
    public static final String CT_VAAS_ACTION_BATCH_STOP_DEVICE_PLAYBACK = "BatchStopDevicePlayback";
    public static final String CT_VAAS_ACTION_START_DEVICE_DOWNLOAD = "StartDeviceDownload";
    public static final String CT_VAAS_ACTION_STOP_DEVICE_DOWNLOAD = "StopDeviceDownload";
    public static final String CT_VAAS_ACTION_RESET_DEVICE_SSRC = "ResetDeviceSSRC";
    public static final String CT_VAAS_ACTION_NOTIFY_DEVICE_ALARM = "NotifyDeviceAlarm";
    public static final String CT_VAAS_ACTION_START_DEVICE_PUSH = "StartDevicePush";
    public static final String CT_VAAS_ACTION_BATCH_START_DEVICE_PUSH = "BatchStartDevicePush";
    public static final String CT_VAAS_ACTION_STOP_DEVICE_PUSH = "StopDevicePush";
    public static final String CT_VAAS_ACTION_BATCH_STOP_DEVICE_PUSH = "BatchStopDevicePush";
    public static final String CT_VAAS_ACTION_START_DEVICE_PULL = "StartDevicePull";
    public static final String CT_VAAS_ACTION_BATCH_START_DEVICE_PULL = "BatchStartDevicePull";
    public static final String CT_VAAS_ACTION_STOP_DEVICE_PULL = "StopDevicePull";
    public static final String CT_VAAS_ACTION_BATCH_STOP_DEVICE_PULL = "BatchStopDevicePull";
    public static final String CT_VAAS_ACTION_START_DEVICE_TALK = "StartDeviceTalk";
    public static final String CT_VAAS_ACTION_DELETE_DEVICE_TALK = "DeleteDeviceTalk";
    public static final String CT_VAAS_ACTION_MODIFY_DEVICE_TALK = "ModifyDeviceTalk";
    public static final String CT_VAAS_ACTION_STOP_DEVICE_TALK = "StopDeviceTalk";
    public static final String CT_VAAS_ACTION_DESCRIBE_DEVICE_TALK = "DescribeDeviceTalk";
    public static final String CT_VAAS_ACTION_BIND_RECORD_TEMPLATE = "BindRecordTemplate";
    public static final String CT_VAAS_ACTION_BIND_RECORD_TEMPLATES = "BindRecordTemplates";
    public static final String CT_VAAS_ACTION_UNBIND_RECORD_TEMPLATE = "UnBindRecordTemplate";
    public static final String CT_VAAS_ACTION_UNBIND_RECORD_TEMPLATES = "UnBindRecordTemplates";
    public static final String CT_VAAS_ACTION_STOP_DEVICE_RECORD = "StopDeviceRecord";
    public static final String CT_VAAS_ACTION_RESET_DEVICE_RECORD = "ResetDeviceRecord";
    public static final String CT_VAAS_ACTION_DESCRIBE_CLOUD_RECORD = "DescribeCloudRecord";
    public static final String CT_VAAS_ACTION_DESCRIBE_CLOUD_RECORDS = "DescribeCloudRecords";
    public static final String CT_VAAS_ACTION_DESCRIBE_LOCAL_RECORD = "DescribeLocalRecord";
    public static final String CT_VAAS_ACTION_DESCRIBE_LIVE_STREAM = "DescribeLiveStream";
    public static final String CT_VAAS_ACTION_DESCRIBE_CLOUD_VOD_STREAM = "DescribeCloudVodStream";
    public static final String CT_VAAS_ACTION_DESCRIBE_LOCAL_VOD_STREAM = "DescribeLocalVodStream";
    public static final String CT_VAAS_ACTION_CONTROL_DEVICE_PLAYBACK = "ControlDevicePlayback";    // user-side API, maybe not usable here?
    public static final String CT_VAAS_ACTION_DESCRIBE_ONLINE_STREAMS = "DescribeOnlineStreams";
    public static final String CT_VAAS_ACTION_START_LIVE_TRANSCODE = "StartLiveTranscode";
    public static final String CT_VAAS_ACTION_STOP_LIVE_TRANSCODE = "StopLiveTranscode";
    public static final String CT_VAAS_ACTION_START_DEVICE_FRAME = "StartDeviceFrame";
    public static final String CT_VAAS_ACTION_STOP_DEVICE_FRAME = "StopDeviceFrame";
    public static final String CT_VAAS_ACTION_DESCRIBE_CLOUD_FRAME = "DescribeCloudFrame";
    public static final String CT_VAAS_ACTION_DESCRIBE_LIVE_THUMBNAIL = "DescribeLiveThumbnail";
    public static final String CT_VAAS_ACTION_START_REMUX = "StartRemux";
    public static final String CT_VAAS_ACTION_STOP_REMUX = "StopRemux";
    public static final String CT_VAAS_ACTION_CREATE_CORS = "CreateCORS";
    public static final String CT_VAAS_ACTION_DELETE_CORS = "DeleteCORS";
    public static final String CT_VAAS_ACTION_DESCRIBE_CORS = "DescribeCORS";
    public static final String CT_VAAS_ACTION_START_CASCADE_PLAY = "StartCascadePlay";
    public static final String CT_VAAS_ACTION_ACK_CASCADE_PLAY = "AckCascadePlay";
    public static final String CT_VAAS_ACTION_STOP_CASCADE_PLAY = "StopCascadePlay";
    public static final String CT_VAAS_ACTION_DESCRIBE_CASCADE_RECORDS = "DescribeCascadeRecords";
    public static final String CT_VAAS_ACTION_START_CASCADE_PLAYBACK = "StartCascadePlayback";
    public static final String CT_VAAS_ACTION_ACK_CASCADE_PLAYBACK = "AckCascadePlayback";
    public static final String CT_VAAS_ACTION_STOP_CASCADE_PLAYBACK = "StopCascadePlayback";
    public static final String CT_VAAS_ACTION_CONTROL_CASCADE_PLAYBACK = "ControlCascadePlayback";
    public static final String CT_VAAS_ACTION_START_CASCADE_DOWNLOAD = "StartCascadeDownload";
    public static final String CT_VAAS_ACTION_ASK_CASCADE_DOWNLOAD = "AckCascadeDownload";
    public static final String CT_VAAS_ACTION_CREATE_RECORD_TEMPLATE = "CreateRecordTemplate";
    public static final String CT_VAAS_ACTION_CREATE_LIVE_TRANSCODE_TEMPLATE = "CreateLiveTranscodeTemplate";
    public static final String CT_VAAS_ACTION_DESCRIBE_STORAGE_REGION = "DescribeStoreRegion";
    public static final String CT_VAAS_ACTION_DESCRIBE_STORAGE_REGIONS = "DescribeStoreRegions";
    public static final String CT_VAAS_ACTION_DELETE_CLOUD_RECORDS = "DeleteCloudRecords";
}