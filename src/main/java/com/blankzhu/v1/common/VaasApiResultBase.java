package com.blankzhu.v1.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * ctyun vaas api result
 */
@Data
public class VaasApiResultBase {
    @JsonProperty(value = "RequestId")
    private String requestId;

    @JsonProperty(value = "ErrorCode")
    private String errorCode;

    @JsonProperty(value = "ErrorMessage")
    private String errorMessage;

    /**
     * if the result succeeded or not, if not, check errorCode & errorMessage
     *
     * @return if the result succeeded or not
     */
    public boolean succeeded() {
        if (errorCode != null && !errorCode.isEmpty())
            return false;

        return errorMessage == null || errorMessage.isEmpty();
    }
}
