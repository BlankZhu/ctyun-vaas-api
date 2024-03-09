package com.blankzhu.v1.entity.device.media;

import com.blankzhu.v1.common.VaasApiResultBase;
import com.blankzhu.v1.entity.device.stream.common.PlayUrl;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class StartLiveTranscodeResult extends VaasApiResultBase {
    @JsonProperty(value = "PlayUrl")
    private PlayUrl playUrl;
    @JsonProperty(value = "TaskId")
    private String taskId;
}
