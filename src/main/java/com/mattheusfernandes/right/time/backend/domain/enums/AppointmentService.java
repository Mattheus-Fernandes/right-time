package com.mattheusfernandes.right.time.backend.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AppointmentService {
    MAINTENANCE(1),
    APPLICATION(2),
    REMOVAL(3),
    COURSE(4);

    private final int value;
}
