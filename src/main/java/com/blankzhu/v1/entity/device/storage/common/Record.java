package com.blankzhu.v1.entity.device.storage.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Record {
    @JsonProperty(value = "RecordId")
    private String recordId;
    @JsonProperty(value = "FileFormat")
    private String fileFormat;
    @JsonProperty(value = "Audio")
    private Audio audio;
    @JsonProperty(value = "Video")
    private Video video;
    @JsonProperty(value = "PlayUrl")
    private PlayUrl playUrl;
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
