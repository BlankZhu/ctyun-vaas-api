package com.blankzhu.v1.entity.device.connectivity.pull.stop;

import com.blankzhu.v1.entity.device.connectivity.common.Device;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class BatchStopDevicePullRequest {
    @JsonProperty(value = "Devices")
    List<Device> devices;
}
