package com.java.threads;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public void service() {
        System.out.println("starting service of the car " + name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("completed service of the car " + name);
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
