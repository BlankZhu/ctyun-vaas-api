package com.blankzhu.v1.entity.device.talk;

import com.blankzhu.v1.entity.device.talk.common.Device;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class StartDeviceTalkRequest {
    @JsonProperty(value = "SrcRegionCode")
    private String srcRegionCode;
    @JsonProperty(value = "DestRegionCode")
    private String destRegionCode;
    @JsonProperty(value = "InProtocol")
    private String inProtocol;
    @JsonProperty(value = "InNetwork")
    private String inNetwork;
    @JsonProperty(value = "SessionId")
    private String sessionId;
    @JsonProperty(value = "AudioKey")
    private String audioKey;
    @JsonProperty(value = "AudioIv")
    private String audioIv;
    @JsonProperty(value = "TransType")
    private String transType;
    @JsonProperty(value = "Devices")
    private List<Device> devices;
}
