package com.assignment.carfactory.service.impl;

import com.assignment.carfactory.entity.CarEntity;
import com.assignment.carfactory.enums.CarTypeEnum;
import com.assignment.carfactory.enums.ErrorCodeEnum;
import com.assignment.carfactory.exception.CarFactoryException;
import com.assignment.carfactory.model.Cabrio;
import com.assignment.carfactory.model.Car;
import com.assignment.carfactory.model.Hatchback;
import com.assignment.carfactory.model.Sedan;
import com.assignment.carfactory.repository.CarRepository;
import com.assignment.carfactory.service.ICarService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Onur Sabit Salman
 * @since 02.04.2021
 */
@Service
@RequiredArgsConstructor
public class CarService implements ICarService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CarService.class);

    private final CarRepository carRepository;

    @Override
    public List<CarEntity> getAllCars() {
        try {
            return carRepository.findAll();
        } catch (Exception exception) {
            LOGGER.error("Exception Message: {}", exception.getMessage());
            throw new CarFactoryException(ErrorCodeEnum.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public String produceCar(String carType) {
        Car car;
        if (CarTypeEnum.CABRIO.name().equalsIgnoreCase(carType)) {
            car = new Cabrio();
        } else if (CarTypeEnum.SEDAN.name().equalsIgnoreCase(carType)) {
            car = new Sedan();
        } else if (CarTypeEnum.HATCHBACK.name().equalsIgnoreCase(carType)) {
            car = new Hatchback();
        } else {
            LOGGER.info("Car type is not valid. Car type: {}", carType);
            throw new CarFactoryException(ErrorCodeEnum.CAR_TYPE_ERROR);
        }
        try {
            CarEntity carEntity = carRepository.save(CarEntity.builder().type(car.getType()).build());
            LOGGER.info("Created: {}", carEntity.toString());
            return car.getType() + " has produced.";
        } catch (Exception exception) {
            LOGGER.error("Exception Message: {}", exception.getMessage());
            throw new CarFactoryException(ErrorCodeEnum.INTERNAL_SERVER_ERROR);
        }
    }
}
