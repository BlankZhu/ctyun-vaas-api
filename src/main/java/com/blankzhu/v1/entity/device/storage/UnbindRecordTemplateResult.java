package com.blankzhu.v1.entity.device.storage;

import com.blankzhu.v1.common.VaasApiResultBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class UnbindRecordTemplateResult extends VaasApiResultBase {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "CreatedTime")
    private String createdTime;
    @JsonProperty(value = "UpdatedTime")
    private String updatedTime;
}
