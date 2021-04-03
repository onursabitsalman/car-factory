package com.assignment.carfactory.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Onur Sabit Salman
 * @since 02.04.2021
 */
@Builder
@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CarEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String type;

}
