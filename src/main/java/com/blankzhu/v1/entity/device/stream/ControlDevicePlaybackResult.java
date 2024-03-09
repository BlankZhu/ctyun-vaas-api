package com.blankzhu.v1.entity.device.stream;

import com.blankzhu.v1.common.VaasApiResultBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ControlDevicePlaybackResult extends VaasApiResultBase {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
}
