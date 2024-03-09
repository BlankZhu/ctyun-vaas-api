package com.blankzhu.v1.entity.device.stream.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StreamList {
    @JsonProperty(value = "SSRC")
    private String SSRC;
    @JsonProperty(value = "IsSSRCValid")
    private String isSSRCValid;
    @JsonProperty(value = "Url")
    private String url;
    @JsonProperty(value = "TransType")
    private String transType;
    @JsonProperty(value = "DeviceTransPort")
    private Long deviceTransPort;
    @JsonProperty(value = "TransIP")
    private Long transIP;
    @JsonProperty(value = "TransPort")
    private Long transPort;
    @JsonProperty(value = "Audio")
    private Audio audio;
    @JsonProperty(value = "Video")
    private Video video;
}
