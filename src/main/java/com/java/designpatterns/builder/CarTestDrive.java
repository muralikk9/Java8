package com.java.designpatterns.builder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CarTestDrive {
    public static void main(String[] args) {
        Car car = Car.builder().engineCapacity(1200).seatCapacity(5).fuelType("petrol").build();
        log.info("engineCapacity: {}, seat capacity={}, fuelType={}", car.getEngineCapacity(), car.getSeatCapacity(), car.getFuelType());

    }
}
