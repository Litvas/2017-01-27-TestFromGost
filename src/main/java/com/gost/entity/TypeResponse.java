package com.gost.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.FieldError;

import java.util.List;

/**
 * Created by AS on 09.02.17.
 */
public class TypeResponse {

    @JsonProperty
    private boolean success;

    public TypeResponse() {
    }

    public boolean isSuccess(boolean b) {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

}
