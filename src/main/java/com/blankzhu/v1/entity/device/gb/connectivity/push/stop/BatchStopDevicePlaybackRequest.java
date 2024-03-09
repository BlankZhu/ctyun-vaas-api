package com.blankzhu.v1.entity.device.gb.connectivity.push.stop;

import com.blankzhu.v1.entity.device.gb.connectivity.common.Device;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class BatchStopDevicePlaybackRequest {
    @JsonProperty(value = "Devices")
    List<Device> devices;
}
