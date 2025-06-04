package com.desouza.client.dto.error;

public class FieldMessageError {

    private final String fieldName;
    private final String message;

    public FieldMessageError(String fieldName, String message) {
        this.fieldName = fieldName;
        this.message = message;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getMessage() {
        return message;
    }

}
