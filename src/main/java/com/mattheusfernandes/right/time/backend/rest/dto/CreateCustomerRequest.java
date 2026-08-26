package com.mattheusfernandes.right.time.backend.rest.dto;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema(description = "Dados necessários para criação de um cliente")
public record CreateCustomerRequest(
        @Schema(
                description = "Nome do cliente",
                example = "Mattheus"
        )
        String name,

        @Schema(
                description = "Sobrenome do cliente",
                example = "Fernandes"
        )
        String lastname,

        @Schema(
                description = "Celular do cliente",
                example = "0000000000"
        )
        String phone
) {
}
