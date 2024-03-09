package com.blankzhu.v1.entity.device.gb.connectivity.notify;

import com.blankzhu.v1.common.VaasApiResultBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class NotifyDeviceAlarmResponse extends VaasApiResultBase {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "CreatedTime")
    private String createdTime;
}
