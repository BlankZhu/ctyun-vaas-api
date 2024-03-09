package com.blankzhu.v1.entity.device.management.delete;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * <a href="https://vaas.ctyun.cn/document/vaas/api/API/VideoDevice/Device/DeleteDevices">see more</a>
 */
@Data
public class DeleteDevicesRequest {
    @JsonProperty(value = "DeviceId")
    private List<String> deviceId;
}
