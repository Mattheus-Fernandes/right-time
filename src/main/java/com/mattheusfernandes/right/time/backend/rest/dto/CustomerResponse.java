package com.mattheusfernandes.right.time.backend.rest.dto;

import lombok.Builder;

import java.util.UUID;

@Builder
public record CustomerResponse(
        UUID id,
        String name,
        String lastname,
        String phone
) { }
