package com.blankzhu.v1.entity.device.connectivity.push.start;

import com.blankzhu.v1.entity.device.connectivity.common.Device;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class BatchStartDevicePushRequest {
    @JsonProperty(value = "SrcRegionCode")
    private String srcRegionCode;
    @JsonProperty(value = "DestRegionCode")
    private String destRegionCode;
    @JsonProperty(value = "RegionVersionNum")
    private String regionVersionNum;
    @JsonProperty(value = "InProtocol")
    private String inProtocol;
    @JsonProperty(value = "InNetwork")
    private String inNetwork;
    @JsonProperty(value = "Devices")
    private List<Device> Devices;
    @JsonProperty(value = "Expires")
    private Long expires;
}
