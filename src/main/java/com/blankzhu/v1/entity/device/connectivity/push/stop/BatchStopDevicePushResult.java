package com.blankzhu.v1.entity.device.connectivity.push.stop;

import com.blankzhu.v1.common.VaasApiResultBase;
import com.blankzhu.v1.entity.device.connectivity.common.Device;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class BatchStopDevicePushResult extends VaasApiResultBase {
    @JsonProperty(value = "Devices")
    private List<Device> devices;
}
