package com.blankzhu.v1.entity.device.storage;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ResetDeviceRecordRequest {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "RecordTemplateId")
    private String recordTemplateId;
    @JsonProperty(value = "SSRC")
    private String SSRC;
    @JsonProperty(value = "SrcRegionCode")
    private String srcRegionCode;
    @JsonProperty(value = "DestRegionCode")
    private String destRegionCode;
}
