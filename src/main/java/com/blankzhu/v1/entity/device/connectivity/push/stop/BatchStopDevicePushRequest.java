package com.blankzhu.v1.entity.device.connectivity.push.stop;

import com.blankzhu.v1.entity.device.connectivity.common.Device;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class BatchStopDevicePushRequest {
    @JsonProperty(value = "Devices")
    private List<Device> devices;
}
