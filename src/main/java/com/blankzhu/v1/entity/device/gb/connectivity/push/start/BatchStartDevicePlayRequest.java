package com.blankzhu.v1.entity.device.gb.connectivity.push.start;

import com.blankzhu.v1.entity.device.gb.connectivity.common.Device;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class BatchStartDevicePlayRequest {
    @JsonProperty(value = "SrcRegionCode")
    private String srcRegionCode;
    @JsonProperty(value = "DestRegionCode")
    private String destRegionCode;
    @JsonProperty(value = "InProtocol")
    private String inProtocol;
    @JsonProperty(value = "InNetwork")
    private String inNetwork;
    @JsonProperty(value = "Devices")
    private List<Device> devices;
    @JsonProperty(value = "Expires")
    private Long expires;
}
