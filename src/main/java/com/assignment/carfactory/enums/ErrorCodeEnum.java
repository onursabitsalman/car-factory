package com.assignment.carfactory.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * @author Onur Sabit Salman
 * @since 02.04.2021
 */
@Getter
@AllArgsConstructor
public enum ErrorCodeEnum {
    INTERNAL_SERVER_ERROR("Internal server error.", HttpStatus.INTERNAL_SERVER_ERROR),
    CAR_TYPE_ERROR("Car type is not valid.", HttpStatus.BAD_REQUEST);

    private final String message;
    private final HttpStatus httpStatus;
}
