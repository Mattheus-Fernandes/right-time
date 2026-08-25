package com.mattheusfernandes.right.time.backend.rest.dto;

public record CreateCustomerRequest(
        String name,
        String lastname,
        String phone
) {
}
