package com.blankzhu.v1.entity.device.gb.connectivity.download.start;

import com.blankzhu.v1.common.VaasApiResultBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class StartDeviceDownloadResult extends VaasApiResultBase {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "TransType")
    private String transType;
    @JsonProperty(value = "TransIP")
    private String transIP;
    @JsonProperty(value = "TransPort")
    private Long transPort;
    @JsonProperty(value = "SSRC")
    private String SSRC;
    @JsonProperty(value = "SSRCExpireTime")
    private Long SSRCExpireTime;
    @JsonProperty(value = "TaskId")
    private String taskId;
    @JsonProperty(value = "CreatedTime")
    private String createdTime;
}
