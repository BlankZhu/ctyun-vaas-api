package com.blankzhu.v1.entity.device.gb.cascade;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class StartCascadePlaybackRequest {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "OutNetwork")
    private String outNetwork;
    @JsonProperty(value = "TransType")
    private String transType;
    @JsonProperty(value = "TcpMode")
    private String tcpMode;
    @JsonProperty(value = "TransIP")
    private String transIP;
    @JsonProperty(value = "TransPort")
    private Long transPort;
    @JsonProperty(value = "StartTime")
    private Long startTime;
    @JsonProperty(value = "EndTime")
    private Long endTime;
    @JsonProperty(value = "SSRC")
    private String SSRC;
}
