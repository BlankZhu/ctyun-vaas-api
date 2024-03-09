package com.blankzhu.v1.entity.device.management.delete;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * <a href="https://vaas.ctyun.cn/document/vaas/api/API/VideoDevice/Device/DeleteDevice">see more</a>
 */
@Data
public class DeleteDeviceRequest {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
}
