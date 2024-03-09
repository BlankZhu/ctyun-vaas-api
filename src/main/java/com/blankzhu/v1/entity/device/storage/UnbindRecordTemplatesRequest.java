package com.blankzhu.v1.entity.device.storage;

import com.blankzhu.v1.entity.device.storage.common.Bind;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class UnbindRecordTemplatesRequest {
    @JsonProperty(value = "Binds")
    private List<Bind> binds;
}
