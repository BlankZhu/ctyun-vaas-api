package com.blankzhu.v1.entity.device.talk;

import com.blankzhu.v1.common.VaasApiResultBase;
import com.blankzhu.v1.entity.device.talk.common.Device;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class DescribeDeviceTalkResult extends VaasApiResultBase {
    @JsonProperty(value = "SessionId")
    private String sessionId;
    @JsonProperty(value = "SessionStatus")
    private String sessionStatus;
    @JsonProperty(value = "transType")
    private String transType;
    @JsonProperty(value = "TransIP")
    private String transIP;
    @JsonProperty(value = "transPort")
    private Long TransPort;
    @JsonProperty(value = "Devices")
    private List<Device> devices;
}
