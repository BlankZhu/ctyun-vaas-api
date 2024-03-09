package com.blankzhu.v1.entity.device.management.delete;

import com.blankzhu.v1.common.VaasApiResultBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class DeleteDevicesResult extends VaasApiResultBase {
    @JsonProperty(value = "DeviceId")
    private List<String> deviceId;
}
