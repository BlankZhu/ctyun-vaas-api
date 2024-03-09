package com.blankzhu.v1.entity.device.media;

import com.blankzhu.v1.common.VaasApiResultBase;
import com.blankzhu.v1.entity.device.media.common.LiveStream;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class DescribeLiveThumbnailResult extends VaasApiResultBase {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "LiveStreams")
    private List<LiveStream> liveStreams;
}
