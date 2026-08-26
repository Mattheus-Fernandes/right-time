package com.mattheusfernandes.right.time.backend.exceptions;

public class CustomerInvalidException extends RuntimeException {
    public CustomerInvalidException(String message) {
        super(message);
    }
}
