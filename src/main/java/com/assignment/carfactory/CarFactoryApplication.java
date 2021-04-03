package com.assignment.carfactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Onur Sabit Salman
 * @since 02.04.2021
 */
@EnableSwagger2
@SpringBootApplication
public class CarFactoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarFactoryApplication.class, args);
    }

}
