package com.assignment.carfactory.service;

import com.assignment.carfactory.entity.CarEntity;

import java.util.List;

/**
 * @author Onur Sabit Salman
 * @since 02.04.2021
 */
public interface ICarService {
    /**
     * to get all cars
     *
     * @return List<CarEntity>
     */
    List<CarEntity> getAllCars();

    /**
     * to produce new car
     *
     * @param carType must be cabrio, sedan or hatchback
     * @return String
     */
    String produceCar(String carType);
}
