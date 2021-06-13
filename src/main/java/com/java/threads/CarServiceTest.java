package com.java.threads;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Car {

    private static final Logger logger = LoggerFactory.getLogger(Car.class);
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public void service() {
        logger.info("starting service of the car: {} " , name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("completed service of the car: {} " , name);
    }
}

class ServiceBay implements Runnable {
    private Car car;

    public ServiceBay(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        car.service();
    }
}


public class CarServiceTest {
    public static void main(String[] args) {
        List<String> carList = Arrays.asList("Tiago", "Nexon", "Harrier", "Safari");
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        carList.stream().forEach(car -> executorService.execute(new ServiceBay(new Car(car))));
        executorService.shutdown();
    }
}
