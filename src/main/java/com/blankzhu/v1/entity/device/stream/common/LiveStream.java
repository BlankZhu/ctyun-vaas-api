package com.blankzhu.v1.entity.device.stream.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LiveStream {
    @JsonProperty(value = "StreamNum")
    private Long streamNum;
    @JsonProperty(value = "StreamStatus")
    private String streamStatus;
    @JsonProperty(value = "RecordStatus")
    private String recordStatus;
    @JsonProperty(value = "Audio")
    private Audio audio;
    @JsonProperty(value = "Video")
    private Video video;
    @JsonProperty(value = "PlayUrl")
    private PlayUrl playUrl;
}
