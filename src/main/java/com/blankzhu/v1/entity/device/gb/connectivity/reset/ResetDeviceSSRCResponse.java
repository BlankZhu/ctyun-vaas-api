package com.blankzhu.v1.entity.device.gb.connectivity.reset;

import com.blankzhu.v1.common.VaasApiResultBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ResetDeviceSSRCResponse extends VaasApiResultBase {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "ResetStatus")
    private String resetStatus;

    @JsonProperty(value = "SSRC")
    private String SSRC;

    @JsonProperty(value = "SSRCExpireTime")
    private Long SSRCExpireTime;
}
