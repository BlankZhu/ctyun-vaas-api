package com.blankzhu.v1.entity.device.management.describe;

import com.blankzhu.v1.common.VaasApiResultBase;
import com.blankzhu.v1.entity.device.management.common.LiveStream;
import com.blankzhu.v1.entity.device.management.common.VodStream;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class DescribeDeviceStatusResult extends VaasApiResultBase {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "LiveStreams")
    private List<LiveStream> liveStreams;
    @JsonProperty(value = "VodStreams")
    private List<VodStream> vodStreams;
    @JsonProperty(value = "RecordTemplateId")
    private String recordTemplateId;
}
