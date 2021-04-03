package com.assignment.carfactory.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Onur Sabit Salman
 * @since 02.04.2021
 */
@Getter
@AllArgsConstructor
public enum CarTypeEnum {
    CABRIO("Cabrio Car"),
    SEDAN("Sedan Car"),
    HATCHBACK("Hatchback Car");

    private final String code;
}
