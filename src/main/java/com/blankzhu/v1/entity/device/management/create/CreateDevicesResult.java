package com.blankzhu.v1.entity.device.management.create;

import com.blankzhu.v1.common.VaasApiResultBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class CreateDevicesResult extends VaasApiResultBase {
    @JsonProperty(value = "DeviceIds")
    private List<String> deviceIds;
    @JsonProperty(value = "CreatedTime")
    private String createdTime;
}
