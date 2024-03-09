package com.blankzhu.v1.entity.device.management.delete;

import com.blankzhu.v1.common.VaasApiResultBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class DeleteDeviceResult extends VaasApiResultBase {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
}
