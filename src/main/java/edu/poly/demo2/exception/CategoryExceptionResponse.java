package edu.poly.demo2.exception;

import lombok.Data;

@Data
public class CategoryExceptionResponse {
    private String message;

    public CategoryExceptionResponse(String message) {
        this.message = message;
    }
}
