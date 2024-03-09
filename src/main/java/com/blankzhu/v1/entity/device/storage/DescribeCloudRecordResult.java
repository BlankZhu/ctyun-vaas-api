package com.blankzhu.v1.entity.device.storage;

import com.blankzhu.v1.common.VaasApiResultBase;
import com.blankzhu.v1.entity.device.storage.common.Audio;
import com.blankzhu.v1.entity.device.storage.common.Video;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class DescribeCloudRecordResult extends VaasApiResultBase {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "RecordType")
    private Long recordType;
    @JsonProperty(value = "FileFormat")
    private String fileFormat;
    @JsonProperty(value = "Audio")
    private Audio audio;
    @JsonProperty(value = "Video")
    private Video video;
    @JsonProperty(value = "DownloadUrl")
    private String downloadUrl;
    @JsonProperty(value = "CoverUrl")
    private String coverUrl;
    @JsonProperty(value = "StartTime")
    private String startTime;
    @JsonProperty(value = "EndTime")
    private String endTime;
    @JsonProperty(value = "FileDuration")
    private Long fileDuration;
    @JsonProperty(value = "FileSize")
    private Long fileSize;
}
