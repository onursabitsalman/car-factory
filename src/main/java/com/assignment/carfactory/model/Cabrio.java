package com.assignment.carfactory.model;

import com.assignment.carfactory.enums.CarTypeEnum;

/**
 * @author Onur Sabit Salman
 * @since 02.04.2021
 */
public class Cabrio implements Car {
    @Override
    public String getType() {
        return CarTypeEnum.CABRIO.getCode();
    }
}
