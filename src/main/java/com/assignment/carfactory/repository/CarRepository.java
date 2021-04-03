package com.assignment.carfactory.repository;

import com.assignment.carfactory.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Onur Sabit Salman
 * @since 02.04.2021
 */
public interface CarRepository extends JpaRepository<CarEntity, Long> {
}
