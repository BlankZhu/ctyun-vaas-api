package com.blankzhu.v1.entity.device.gb.connectivity.push.start;

import com.blankzhu.v1.common.VaasApiResultBase;
import com.blankzhu.v1.entity.device.gb.connectivity.common.DevicePushInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class BatchStartDevicePlaybackResult extends VaasApiResultBase {
    @JsonProperty(value = "Devices")
    List<DevicePushInfo> devices;
}
