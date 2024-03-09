package com.blankzhu.v1;

import com.blankzhu.v1.config.VaasApiClientConfiguration;
import com.blankzhu.v1.entity.cloud.DeleteCloudRecordsRequest;
import com.blankzhu.v1.entity.cloud.DeleteCloudRecordsResult;
import com.blankzhu.v1.entity.device.connectivity.pull.start.BatchStartDevicePullRequest;
import com.blankzhu.v1.entity.device.connectivity.pull.start.BatchStartDevicePullResult;
import com.blankzhu.v1.entity.device.connectivity.pull.start.StartDevicePullRequest;
import com.blankzhu.v1.entity.device.connectivity.pull.start.StartDevicePullResult;
import com.blankzhu.v1.entity.device.connectivity.pull.stop.BatchStopDevicePullRequest;
import com.blankzhu.v1.entity.device.connectivity.pull.stop.BatchStopDevicePullResult;
import com.blankzhu.v1.entity.device.connectivity.pull.stop.StopDevicePullRequest;
import com.blankzhu.v1.entity.device.connectivity.pull.stop.StopDevicePullResult;
import com.blankzhu.v1.entity.device.connectivity.push.start.BatchStartDevicePushRequest;
import com.blankzhu.v1.entity.device.connectivity.push.start.BatchStartDevicePushResult;
import com.blankzhu.v1.entity.device.connectivity.push.start.StartDevicePushRequest;
import com.blankzhu.v1.entity.device.connectivity.push.start.StartDevicePushResult;
import com.blankzhu.v1.entity.device.connectivity.push.stop.BatchStopDevicePushRequest;
import com.blankzhu.v1.entity.device.connectivity.push.stop.BatchStopDevicePushResult;
import com.blankzhu.v1.entity.device.connectivity.push.stop.StopDevicePushRequest;
import com.blankzhu.v1.entity.device.connectivity.push.stop.StopDevicePushResult;
import com.blankzhu.v1.entity.device.domain.*;
import com.blankzhu.v1.entity.device.gb.cascade.*;
import com.blankzhu.v1.entity.device.gb.connectivity.download.start.StartDeviceDownloadRequest;
import com.blankzhu.v1.entity.device.gb.connectivity.download.start.StartDeviceDownloadResult;
import com.blankzhu.v1.entity.device.gb.connectivity.download.stop.StopDeviceDownloadRequest;
import com.blankzhu.v1.entity.device.gb.connectivity.download.stop.StopDeviceDownloadResult;
import com.blankzhu.v1.entity.device.gb.connectivity.notify.NotifyDeviceAlarmRequest;
import com.blankzhu.v1.entity.device.gb.connectivity.notify.NotifyDeviceAlarmResponse;
import com.blankzhu.v1.entity.device.gb.connectivity.push.start.*;
import com.blankzhu.v1.entity.device.gb.connectivity.push.stop.*;
import com.blankzhu.v1.entity.device.gb.connectivity.reset.ResetDeviceSSRCRequest;
import com.blankzhu.v1.entity.device.gb.connectivity.reset.ResetDeviceSSRCResponse;
import com.blankzhu.v1.entity.device.management.create.CreateDeviceRequest;
import com.blankzhu.v1.entity.device.management.create.CreateDeviceResult;
import com.blankzhu.v1.entity.device.management.create.CreateDevicesRequest;
import com.blankzhu.v1.entity.device.management.create.CreateDevicesResult;
import com.blankzhu.v1.entity.device.management.delete.DeleteDeviceRequest;
import com.blankzhu.v1.entity.device.management.delete.DeleteDeviceResult;
import com.blankzhu.v1.entity.device.management.delete.DeleteDevicesRequest;
import com.blankzhu.v1.entity.device.management.describe.*;
import com.blankzhu.v1.entity.device.media.*;
import com.blankzhu.v1.entity.device.storage.*;
import com.blankzhu.v1.entity.device.stream.*;
import com.blankzhu.v1.entity.device.talk.*;
import com.blankzhu.v1.entity.resource.DescribeStoreRegionRequest;
import com.blankzhu.v1.entity.resource.DescribeStoreRegionResult;
import com.blankzhu.v1.entity.resource.DescribeStoreRegionsRequest;
import com.blankzhu.v1.entity.resource.DescribeStoreRegionsResult;
import com.blankzhu.v1.entity.template.CreateLiveTranscodeTemplateRequest;
import com.blankzhu.v1.entity.template.CreateLiveTranscodeTemplateResult;
import com.blankzhu.v1.entity.template.CreateRecordTemplateRequest;
import com.blankzhu.v1.entity.template.CreateRecordTemplateResult;
import feign.Headers;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;

import static com.blankzhu.v1.common.VaasPublicParamConstants.*;

@FeignClient(name = "VaasApi", configuration = VaasApiClientConfiguration.class)
public interface VaasApi {
    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_CREATE_DEVICE)
    CreateDeviceResult createDevice(@RequestBody CreateDeviceRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_CREATE_DEVICES)
    CreateDevicesResult createDevices(@RequestBody CreateDevicesRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_DELETE_DEVICE)
    DeleteDeviceResult deleteDevice(@RequestBody DeleteDeviceRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_DELETE_DEVICES)
    DeleteDeviceResult deleteDevices(@RequestBody DeleteDevicesRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_DESCRIBE_DEVICE)
    DescribeDeviceResult describeDevice(@RequestBody DescribeDeviceRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_DESCRIBE_DEVICE_STATUS)
    DescribeDeviceStatusResult describeDeviceStatus(@RequestBody DescribeDeviceStatusRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_DESCRIBE_DEVICE_STATUS_LIST)
    DescribeDeviceStatusListResult describeDeviceStatusList(@RequestBody DescribeDeviceStatusListRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_START_DEVICE_PLAY)
    StartDevicePlayResult startDevicePlay(@RequestBody StartDevicePlayRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_BATCH_START_DEVICE_PLAY)
    BatchStartDevicePlayResult batchStartDevicePlay(@RequestBody BatchStartDevicePlayResult request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_STOP_DEVICE_PLAY)
    StopDevicePlayResult stopDevicePlay(@RequestBody StopDevicePlayRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_BATCH_STOP_DEVICE_PLAY)
    BatchStopDevicePlayResult batchStopDevicePlay(@RequestBody BatchStopDevicePlayResult request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_START_DEVICE_PLAYBACK)
    StartDevicePlaybackResult startDevicePlayback(@RequestBody StartDevicePlaybackRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_BATCH_START_DEVICE_PLAYBACK)
    BatchStartDevicePlaybackResult BatchStartDevicePlayback(@RequestBody BatchStartDevicePlaybackRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_STOP_DEVICE_PLAYBACK)
    StopDevicePlaybackResult stopDevicePlayback(@RequestBody StopDevicePlaybackRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_BATCH_STOP_DEVICE_PLAYBACK)
    BatchStopDevicePlaybackResult batchStopDevicePlayback(@RequestBody BatchStopDevicePlaybackRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_START_DEVICE_DOWNLOAD)
    StartDeviceDownloadResult startDeviceDownload(@RequestBody StartDeviceDownloadRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_STOP_DEVICE_DOWNLOAD)
    StopDeviceDownloadResult stopDeviceDownload(@RequestBody StopDeviceDownloadRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_RESET_DEVICE_SSRC)
    ResetDeviceSSRCResponse resetDeviceSSRC(@RequestBody ResetDeviceSSRCRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_NOTIFY_DEVICE_ALARM)
    NotifyDeviceAlarmResponse notifyDeviceAlarm(@RequestBody NotifyDeviceAlarmRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_START_DEVICE_PUSH)
    StartDevicePushResult startDevicePush(@RequestBody StartDevicePushRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_BATCH_START_DEVICE_PUSH)
    BatchStartDevicePushResult batchStartDevicePush(@RequestBody BatchStartDevicePushRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_STOP_DEVICE_PUSH)
    StopDevicePushResult stopDevicePush(@RequestBody StopDevicePushRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_BATCH_STOP_DEVICE_PUSH)
    BatchStopDevicePushResult batchStopDevicePush(@RequestBody BatchStopDevicePushRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_START_DEVICE_PULL)
    StartDevicePullResult startDevicePull(@RequestBody StartDevicePullRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_BATCH_START_DEVICE_PULL)
    BatchStartDevicePullResult batchStartDevicePull(@RequestBody BatchStartDevicePullRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_STOP_DEVICE_PULL)
    StopDevicePullResult stopDevicePull(@RequestBody StopDevicePullRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_BATCH_STOP_DEVICE_PULL)
    BatchStopDevicePullResult BatchStopDevicePull(@RequestBody BatchStopDevicePullRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_START_DEVICE_TALK)
    StartDeviceTalkResult StartDeviceTalk(@RequestBody StartDeviceTalkRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_DELETE_DEVICE_TALK)
    DeleteDeviceTalkResult deleteDeviceTalk(@RequestBody DeleteDeviceTalkRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_MODIFY_DEVICE_TALK)
    ModifyDeviceTalkResult modifyDeviceTalk(@RequestBody ModifyDeviceTalkRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_STOP_DEVICE_TALK)
    StopDeviceTalkResult stopDeviceTalk(@RequestBody StopDeviceTalkRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_DESCRIBE_DEVICE_TALK)
    DescribeDeviceTalkResult describeDeviceTalk(@RequestBody DescribeDeviceTalkRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_BIND_RECORD_TEMPLATE)
    BindRecordTemplateResult bindRecordTemplate(@RequestBody BindRecordTemplateRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_BIND_RECORD_TEMPLATES)
    BindRecordTemplatesResult bindRecordTemplates(@RequestBody BindRecordTemplatesRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_UNBIND_RECORD_TEMPLATE)
    UnbindRecordTemplateResult unbindRecordTemplate(@RequestBody UnbindRecordTemplateRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_UNBIND_RECORD_TEMPLATES)
    UnbindRecordTemplatesResult unbindRecordTemplates(@RequestBody UnbindRecordTemplatesRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_STOP_DEVICE_RECORD)
    StopDeviceRecordResult stopDeviceRecord(@RequestBody StopDeviceRecordRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_RESET_DEVICE_RECORD)
    ResetDeviceRecordResult resetDeviceRecord(@RequestBody ResetDeviceRecordRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_DESCRIBE_CLOUD_RECORD)
    DescribeCloudRecordResult describeCloudRecord(@RequestBody DescribeCloudRecordRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_DESCRIBE_CLOUD_RECORDS)
    DescribeCloudRecordsResult describeCloudRecords(@RequestBody DescribeCloudRecordsRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_DESCRIBE_LOCAL_RECORD)
    DescribeLocalRecordResult describeLocalRecord(@RequestBody DescribeLocalRecordRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_DESCRIBE_LIVE_STREAM)
    DescribeLiveStreamResult describeLiveStream(@RequestBody DescribeLiveStreamRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_DESCRIBE_CLOUD_VOD_STREAM)
    DescribeCloudVodStreamResult describeCloudVodStream(@RequestBody DescribeCloudVodStreamRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_DESCRIBE_LOCAL_VOD_STREAM)
    DescribeLocalVodStreamResult describeLocalVodStream(@RequestBody DescribeLocalVodStreamRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_CONTROL_DEVICE_PLAYBACK)
    ControlDevicePlaybackResult controlDevicePlayback(@RequestBody ControlDevicePlaybackRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_DESCRIBE_ONLINE_STREAMS)
    DescribeOnlineStreamsResult describeOnlineStreams(@RequestBody DescribeOnlineStreamsRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_START_LIVE_TRANSCODE)
    StartLiveTranscodeResult startLiveTranscode(@RequestBody StartLiveTranscodeRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_STOP_LIVE_TRANSCODE)
    StopLiveTranscodeResult stopLiveTranscode(@RequestBody StopLiveTranscodeRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_START_DEVICE_FRAME)
    StartDeviceFrameResult startDeviceFrame(@RequestBody StartDeviceFrameRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_STOP_DEVICE_FRAME)
    StopDeviceFrameResult stopDeviceFrame(@RequestBody StopDeviceFrameRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_DESCRIBE_CLOUD_FRAME)
    DescribeCloudFrameResult describeCloudFrame(@RequestBody DescribeCloudFrameRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_DESCRIBE_LIVE_THUMBNAIL)
    DescribeLiveThumbnailResult describeLiveThumbnail(@RequestBody DescribeLiveThumbnailRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_START_REMUX)
    StartRemuxResult startRemux(@RequestBody StartRemuxRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_STOP_REMUX)
    StopRemuxResult stopRemux(@RequestBody StopRemuxRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_CREATE_CORS)
    CreateCORSResult createCORS(@RequestBody CreateCORSRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_DELETE_CORS)
    DeleteCORSResult deleteCORS(@RequestBody DeleteCORSRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_DESCRIBE_CORS)
    DescribeCORSResult describeCORS(@RequestBody DescribeCORSRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_START_CASCADE_PLAY)
    StartCascadePlayResult startCascadePlay(@RequestBody StartCascadePlayRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_ACK_CASCADE_PLAY)
    AckCascadePlayResult ackCascadePlay(@RequestBody AckCascadePlayRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_STOP_CASCADE_PLAY)
    StopCascadePlayResult stopCascadePlay(@RequestBody StopCascadePlayRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_DESCRIBE_CASCADE_RECORDS)
    DescribeCascadeRecordsResult describeCascadeRecords(@RequestBody DescribeCascadeRecordsRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_START_CASCADE_PLAYBACK)
    StartCascadePlaybackResult startCascadePlayback(@RequestBody StartCascadePlaybackRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_ACK_CASCADE_PLAYBACK)
    AckCascadePlaybackResult ackCascadePlayback(@RequestBody AckCascadePlaybackRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_STOP_CASCADE_PLAYBACK)
    StopCascadePlaybackResult stopCascadePlayback(@RequestBody StopCascadePlaybackRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_CONTROL_CASCADE_PLAYBACK)
    ControlCascadePlaybackResult controlCascadePlayback(@RequestBody ControlCascadePlaybackRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_START_CASCADE_DOWNLOAD)
    StartCascadeDownloadResult startCascadeDownload(@RequestBody StartCascadeDownloadRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_ASK_CASCADE_DOWNLOAD)
    AckCascadeDownloadResult ackCascadeDownload(@RequestBody AckCascadeDownloadRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_CREATE_RECORD_TEMPLATE)
    CreateRecordTemplateResult createRecordTemplate(@RequestBody CreateRecordTemplateRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_CREATE_LIVE_TRANSCODE_TEMPLATE)
    CreateLiveTranscodeTemplateResult createLiveTranscodeTemplate(@RequestBody CreateLiveTranscodeTemplateRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_DESCRIBE_STORAGE_REGION)
    DescribeStoreRegionResult describeStoreRegion(@RequestBody DescribeStoreRegionRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_DESCRIBE_STORAGE_REGIONS)
    DescribeStoreRegionsResult describeStoreRegions(@RequestBody DescribeStoreRegionsRequest request);

    @RequestLine("POST /")
    @Headers(ACTION_HEADER + ": " + CT_VAAS_ACTION_DELETE_CLOUD_RECORDS)
    DeleteCloudRecordsResult deleteCloudRecords(@RequestBody DeleteCloudRecordsRequest request);
}
