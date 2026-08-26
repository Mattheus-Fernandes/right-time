package com.mattheusfernandes.right.time.backend.exceptions;

public class CustomerAlreadyExistsException extends RuntimeException {
    public CustomerAlreadyExistsException(String message) {
        super(message);
    }
}
