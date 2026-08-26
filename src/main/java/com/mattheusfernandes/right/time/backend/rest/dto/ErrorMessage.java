package com.mattheusfernandes.right.time.backend.rest.dto;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema(description = "Resposta erro da API")
public record ErrorMessage(

        @Schema(
                description = "Código HTTP do erro",
                example = "409"
        )
        int status,

        @Schema(
                description = "Mensagem do erro",
                example = "Cliente já cadastrado"
        )
        String message
) {
}
