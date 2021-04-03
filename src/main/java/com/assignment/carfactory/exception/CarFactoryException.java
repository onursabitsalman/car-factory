package com.assignment.carfactory.exception;


import com.assignment.carfactory.enums.ErrorCodeEnum;
import lombok.Getter;

/**
 * @author Onur Sabit Salman
 * @since 02.04.2021
 */
@Getter
public class CarFactoryException extends RuntimeException {

    private final ErrorCodeEnum errorCode;

    public CarFactoryException(ErrorCodeEnum errorCode) {
        super();
        this.errorCode = errorCode;
    }
}