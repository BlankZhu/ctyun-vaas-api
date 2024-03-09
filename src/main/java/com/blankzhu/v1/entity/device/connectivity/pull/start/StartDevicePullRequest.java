package com.blankzhu.v1.entity.device.connectivity.pull.start;

import com.blankzhu.v1.entity.device.connectivity.common.Device;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class StartDevicePullRequest extends Device {
    @JsonProperty(value = "SrcRegionCode")
    private String srcRegionCode;
    @JsonProperty(value = "DestRegionCode")
    private String destRegionCode;
    @JsonProperty(value = "InProtocol")
    private String inProtocol;
    @JsonProperty(value = "InNetwork")
    private String inNetwork;
}
