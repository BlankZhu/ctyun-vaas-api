package com.blankzhu.v1.entity.device.talk;

import com.blankzhu.v1.common.VaasApiResultBase;
import com.blankzhu.v1.entity.device.talk.common.Device;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class StartDeviceTalkResult extends VaasApiResultBase {
    @JsonProperty(value = "SessionId")
    private String sessionId;
    @JsonProperty(value = "TransType")
    private String transType;
    @JsonProperty(value = "TransIP")
    private String transIP;
    @JsonProperty(value = "TransPort")
    private Long transPort;
    @JsonProperty(value = "Devices")
    private List<Device> devices;
}
