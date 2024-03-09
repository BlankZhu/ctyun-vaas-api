package com.blankzhu.v1.entity.device.connectivity.push.start;

import com.blankzhu.v1.common.VaasApiResultBase;
import com.blankzhu.v1.entity.device.connectivity.common.Device;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class BatchStartDevicePushResult extends VaasApiResultBase {
    @JsonProperty(value = "Devices")
    List<Device> devices;
}
