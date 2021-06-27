package com.java.designpatterns.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Car {
    private int engineCapacity;
    private String fuelType;
    private int seatCapacity;
}
