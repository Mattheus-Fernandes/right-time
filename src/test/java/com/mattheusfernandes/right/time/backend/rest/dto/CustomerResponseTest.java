package com.mattheusfernandes.right.time.backend.rest.dto;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class CustomerResponseTest {

    @Test
    void shouldReturnProvidedData() {
        UUID id = UUID.randomUUID();

        CustomerResponse response = new CustomerResponse(
                id,
                "Nome",
                "Sobrenome",
                "00000000000"
        );

        assertEquals(id, response.id());
        assertEquals("Nome", response.name());
        assertEquals("Sobrenome", response.lastname());
        assertEquals("00000000000", response.phone());
    }
}