package com.blankzhu.v1.entity.device.stream;

import com.blankzhu.v1.common.VaasApiResultBase;
import com.blankzhu.v1.entity.device.stream.common.Audio;
import com.blankzhu.v1.entity.device.stream.common.PlayUrl;
import com.blankzhu.v1.entity.device.stream.common.Video;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class DescribeLocalVodStreamResult extends VaasApiResultBase {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "StreamStatus")
    private String streamStatus;
    @JsonProperty(value = "Audio")
    private Audio audio;
    @JsonProperty(value = "Video")
    private Video video;
    @JsonProperty(value = "PlayUrl")
    private PlayUrl playUrl;
}
