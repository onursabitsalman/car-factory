package com.assignment.carfactory.service.impl;

import com.assignment.carfactory.entity.CarEntity;
import com.assignment.carfactory.enums.CarTypeEnum;
import com.assignment.carfactory.exception.CarFactoryException;
import com.assignment.carfactory.repository.CarRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CarServiceTest {

    @InjectMocks
    private CarService carService;

    @Mock
    private CarRepository carRepository;

    @Test
    public void getAllCars_successfully() {
        CarEntity carEntity = CarEntity.builder().id(1L).type("cabrio").build();
        CarEntity carEntity2 = CarEntity.builder().id(2L).type("hatchback").build();
        CarEntity carEntity3 = CarEntity.builder().id(3L).type("sedan").build();
        List<CarEntity> carEntities = new ArrayList<>(Arrays.asList(carEntity, carEntity2, carEntity3));

        when(carRepository.findAll()).thenReturn(carEntities);
        List<CarEntity> result = carService.getAllCars();
        assertEquals(result, carEntities);
    }

    @Test
    public void getAllCars_findAllNotWorking_expectedCarFactoryException() {
        when(carRepository.findAll()).thenThrow(RuntimeException.class);
        assertThrows(CarFactoryException.class, () -> carService.getAllCars());
    }

    @Test
    public void produceCar_successfully_addedCabrio() {
        String carType = CarTypeEnum.CABRIO.getCode();
        CarEntity car = CarEntity
                .builder()
                .id(1L)
                .type(carType)
                .build();
        when(carRepository.save(any())).thenReturn(car);
        String result = carService.produceCar("cabrio");
        assertEquals(carType + " has produced.", result);
    }

    @Test
    public void produceCar_successfully_addedHatchback() {
        String carType = CarTypeEnum.HATCHBACK.getCode();
        CarEntity car = CarEntity
                .builder()
                .id(2L)
                .type(carType)
                .build();
        when(carRepository.save(any())).thenReturn(car);
        String result = carService.produceCar("hatchback");
        assertEquals(carType + " has produced.", result);
    }

    @Test
    public void produceCar_successfully_addedSedan() {
        String carType = CarTypeEnum.SEDAN.getCode();
        CarEntity car = CarEntity
                .builder()
                .id(3L)
                .type(carType)
                .build();
        when(carRepository.save(any())).thenReturn(car);
        String result = carService.produceCar("sedan");
        assertEquals(carType + " has produced.", result);
    }

    @Test
    public void produceCar_carTypeNotValid_expectedCarFactoryException() {
        assertThrows(CarFactoryException.class, () -> carService.produceCar("test"));
    }

    @Test
    public void produceCar_saveNotWorking_expectedCarFactoryException() {
        when(carRepository.save(any())).thenThrow(RuntimeException.class);
        assertThrows(CarFactoryException.class, () -> carService.produceCar("sedan"));
    }
}