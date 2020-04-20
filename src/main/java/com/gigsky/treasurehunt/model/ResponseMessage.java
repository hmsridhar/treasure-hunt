package com.gigsky.treasurehunt.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Created by harshams on 20/04/2020
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ResponseMessage {

    @JsonProperty
    private String type = "responseMessage";

    @JsonProperty
    private String message;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
