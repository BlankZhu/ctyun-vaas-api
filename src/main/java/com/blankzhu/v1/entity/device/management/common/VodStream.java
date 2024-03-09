package com.blankzhu.v1.entity.device.management.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class VodStream {
    @JsonProperty(value = "SSRC")
    private String SSRC;
    @JsonProperty(value = "StreamStatus")
    private String streamStatus;
    @JsonProperty(value = "TransType")
    private String transType;
    @JsonProperty(value = "RecordStatus")
    private String recordStatus;
    @JsonProperty(value = "RecordingSuccessRate")
    private Double recordingSuccessRate;
    @JsonProperty(value = "Audio")
    private StreamAudio audio;
    @JsonProperty(value = "Video")
    private StreamVideo video;
}
