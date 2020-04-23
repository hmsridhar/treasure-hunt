package com.gigsky.treasurehunt.model.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;

/**
 * Created by harshams on 20/04/2020
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ObjectList {

    @JsonProperty
    private String type;

    @JsonProperty
    private List<?> list;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }
}
