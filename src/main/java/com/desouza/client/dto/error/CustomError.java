package com.desouza.client.dto.error;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonInclude;

//Make suer unused fields don't clutter the JSON.
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomError {

    private String error;
    private Integer status;
    private String path;
    private Instant timestamp;

    public CustomError(String error, Integer status, String path, Instant timestamp) {
        this.error = error;
        this.status = status;
        this.path = path;
        this.timestamp = timestamp;
    }

    public String getError() {
        return error;
    }

    public String getPath() {
        return path;
    }

    public Integer getStatus() {
        return status;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

}