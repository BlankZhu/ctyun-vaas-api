package com.blankzhu.v1.entity.device.media;

import com.blankzhu.v1.entity.device.stream.common.Watermark;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StartLiveTranscodeRequest {
    @JsonProperty(value = "DestRegionCode")
    private String destRegionCode;
    @JsonProperty(value = "LiveUrl")
    private String liveUrl;
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "StreamNum")
    private Long streamNum;
    @JsonProperty(value = "LiveTranscodeTemplateId")
    private String liveTranscodeTemplateId;
    @JsonProperty(value = "Expires")
    private Long expires;
    @JsonProperty(value = "Watermark")
    private Watermark watermark;
}
