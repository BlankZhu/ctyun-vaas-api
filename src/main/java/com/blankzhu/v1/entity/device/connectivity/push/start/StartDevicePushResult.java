package com.blankzhu.v1.entity.device.connectivity.push.start;

import com.blankzhu.v1.common.VaasApiResultBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class StartDevicePushResult extends VaasApiResultBase {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "PushUrl")
    private String pushUrl;
    @JsonProperty(value = "UrlExpireTime")
    private String urlExpireTime;
    @JsonProperty(value = "CreatedTime")
    private String createdTime;
}
