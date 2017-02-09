package com.gost.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by AS on 09.02.17.
 */
public class TypeResponseWithErrors extends TypeResponse {

    @JsonProperty
    private List<String> errors;

    public TypeResponseWithErrors() {
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }


}
