package com.blankzhu.v1.entity.device.stream.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PlayUrl {
    @JsonProperty(value = "RtmpUrl")
    private String rtmpUrl;
    @JsonProperty(value = "FlvUrl")
    private String flvUrl;
    @JsonProperty(value = "HlsUrl")
    private String hlsUrl;
    @JsonProperty(value = "RtspUrl")
    private String rtspUrl;
}
