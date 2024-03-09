package com.blankzhu.v1.entity.device.management.create;

import com.blankzhu.v1.entity.device.management.common.Device;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * <a href="https://vaas.ctyun.cn/document/vaas/api/API/VideoDevice/Device/CreateDevices">see more</a>
 */

@Data
public class CreateDevicesRequest {
    @JsonProperty(value = "Devices")
    private List<Device> devices;
}
