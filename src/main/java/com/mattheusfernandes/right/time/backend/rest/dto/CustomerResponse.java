package com.mattheusfernandes.right.time.backend.rest.dto;

import lombok.Builder;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.util.UUID;

@Schema(description = "Dados do cliente")
@Builder
public record CustomerResponse(
        @Schema(
                description = "Identificador único do cliente",
                example = "Mattheus"
        )
        UUID id,
        @Schema(
                description = "Nome do cliente",
                example = "Mattheus"
        )
        String name,

        @Schema(
                description = "Nome do cliente",
                example = "Fernandes"
        )
        String lastname,

        @Schema(
                description = "Nome do cliente",
                example = "00000000000"
        )
        String phone
) { }
