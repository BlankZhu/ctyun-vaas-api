package com.blankzhu.v1.entity.device.talk;

import com.blankzhu.v1.entity.device.talk.common.Device;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ModifyDeviceTalkRequest {
    @JsonProperty(value = "SessionId")
    private String sessionId;
    @JsonProperty(value = "Devices")
    private List<Device> devices;
}
