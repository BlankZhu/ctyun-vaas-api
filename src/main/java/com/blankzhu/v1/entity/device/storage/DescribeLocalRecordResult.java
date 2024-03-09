package com.blankzhu.v1.entity.device.storage;

import com.blankzhu.v1.common.VaasApiResultBase;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class DescribeLocalRecordResult extends VaasApiResultBase {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "StreamStatus")
    private String streamStatus;
    @JsonProperty(value = "DownloadUrl")
    private String downloadUrl;
    @JsonProperty(value = "FileSize")
    private Long fileSize;
}
