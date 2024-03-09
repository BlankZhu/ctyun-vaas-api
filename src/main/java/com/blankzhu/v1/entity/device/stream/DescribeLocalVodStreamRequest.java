package com.blankzhu.v1.entity.device.stream;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DescribeLocalVodStreamRequest {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "OutNetwork")
    private String outNetwork;
    @JsonProperty(value = "OutProtocol")
    private String outProtocol;
    @JsonProperty(value = "SSRC")
    private String SSRC;
    @JsonProperty(value = "Expires")
    private Long expires;
}
