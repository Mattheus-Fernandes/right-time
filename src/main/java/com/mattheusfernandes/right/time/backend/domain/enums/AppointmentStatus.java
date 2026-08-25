package com.mattheusfernandes.right.time.backend.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AppointmentStatus {
    COMPLETED(1),
    CONFIRMED(2),
    CANCELED(3),
    SCHEDULED(4);

    private final int value;
}
