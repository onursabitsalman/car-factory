package com.assignment.carfactory.model;

import com.assignment.carfactory.enums.CarTypeEnum;

/**
 * @author Onur Sabit Salman
 * @since 02.04.2021
 */
public class Hatchback implements Car {
    @Override
    public String getType() {
        return CarTypeEnum.HATCHBACK.getCode();
    }
}
