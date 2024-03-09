package com.blankzhu.v1.entity.device.stream;

import com.blankzhu.v1.entity.device.stream.common.Watermark;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DescribeLiveStreamRequest {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "OutNetwork")
    private String outNetwork;
    @JsonProperty(value = "StreamNum")
    private Long streamNum;
    @JsonProperty(value = "OutProtocol")
    private String outProtocol;
    @JsonProperty(value = "Expires")
    private Long expires;
    @JsonProperty(value = "Watermark")
    private Watermark watermark;
}
