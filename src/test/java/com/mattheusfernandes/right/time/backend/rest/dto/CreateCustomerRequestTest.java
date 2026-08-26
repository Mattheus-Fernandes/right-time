package com.mattheusfernandes.right.time.backend.rest.dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateCustomerRequestTest {

    @Test
    void shouldReturnProvidedData() {
        CreateCustomerRequest request = new CreateCustomerRequest(
                "Mattheus",
                "Fernandes",
                "11976115590"
        );

        assertEquals("Mattheus", request.name());
        assertEquals("Fernandes", request.lastname());
        assertEquals("11976115590", request.phone());
    }
}