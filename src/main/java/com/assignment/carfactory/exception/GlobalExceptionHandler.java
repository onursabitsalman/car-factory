package com.assignment.carfactory.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Onur Sabit Salman
 * @since 02.04.2021
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * to handle CarFactoryException
     *
     * @param exception CarFactoryException
     * @return ResponseEntity<String>
     */
    @ExceptionHandler({CarFactoryException.class})
    public ResponseEntity<String> carFactoryExceptionHandler(CarFactoryException exception) {
        return ResponseEntity
                .status(exception.getErrorCode().getHttpStatus())
                .body(exception.getErrorCode().getMessage());
    }
}
