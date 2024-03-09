package com.blankzhu.v1.entity.device.gb.connectivity.notify;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class NotifyDeviceAlarmRequest {
    @JsonProperty(value = "DeviceId")
    private String deviceId;
    @JsonProperty(value = "AlarmPriority")
    private Long alarmPriority;
    @JsonProperty(value = "AlarmMethod")
    private Long alarmMethod;
    @JsonProperty(value = "AlarmTime")
    private String alarmTime;
    @JsonProperty(value = "AlarmDescription")
    private String alarmDescription;
    @JsonProperty(value = "Longitude")
    private Double longitude;
    @JsonProperty(value = "Latitude")
    private Double latitude;
    @JsonProperty(value = "AlarmType")
    private Long alarmType;
    @JsonProperty(value = "EventType")
    private Long eventType;
}
