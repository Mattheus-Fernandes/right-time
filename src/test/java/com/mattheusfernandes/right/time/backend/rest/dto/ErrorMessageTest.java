package com.mattheusfernandes.right.time.backend.rest.dto;

import jakarta.ws.rs.core.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ErrorMessageTest {

    @Test
    void shouldReturnErrorWithMessageAndCode() {

        ErrorMessage message = new ErrorMessage(
                400,
                "Nome é obrigatório"
        );

        assertEquals(Response.Status.BAD_REQUEST.getStatusCode(), message.status());
        assertNotEquals(Response.Status.CREATED.getStatusCode(), message.status());
        assertNotNull(message.message());
    }

}