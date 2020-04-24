package com.gigsky.treasurehunt.model.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Created by harshams on 25/04/2020
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Passkey {

    @JsonProperty
    private String type = "passkey";

    @JsonProperty
    private String key;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
