package com.assignment.carfactory.controller;

import com.assignment.carfactory.entity.CarEntity;
import com.assignment.carfactory.service.ICarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Onur Sabit Salman
 * @since 02.04.2021
 */
@RestController
@RequestMapping(path = "/car")
@RequiredArgsConstructor
public class CarController {

    private final ICarService carService;

    /**
     * to get all cars
     *
     * @return ResponseEntity<List<CarEntity>>
     */
    @GetMapping
    public ResponseEntity<List<CarEntity>> getAllCars() {
        return ResponseEntity.ok(carService.getAllCars());
    }

    /**
     * to produce new car
     *
     * @param carType must be cabrio, sedan or hatchback
     * @return ResponseEntity<String>
     */
    @PostMapping
    public ResponseEntity<String> produceCar(@RequestBody String carType) {
        return ResponseEntity.ok(carService.produceCar(carType));
    }
}
