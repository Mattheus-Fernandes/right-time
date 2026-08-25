package com.mattheusfernandes.right.time.backend.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MarkingColor {
    LILAC(1),
    ORANGE(2),
    RED(3),
    GREEN(4);

    private final int value;
}
