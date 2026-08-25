package com.mattheusfernandes.right.time.backend.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum NotificationStatus {
    PENDING(1),
    SENT(2),
    FAILED(3);

    private final int value;
}
