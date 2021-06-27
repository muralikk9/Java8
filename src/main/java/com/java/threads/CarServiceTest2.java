package com.java.threads;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Car1 {
    private static final Logger logger = LoggerFactory.getLogger(Car1.class);
    private String name;
    private String type;
    private int charge;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getCharge() {
        return charge;
    }

    public Car1(String name, String type, int charge) {
        this.name = name;
        this.type = type;
        this.charge = charge;
    }

    public int service() {
        logger.info("starting service of the car : {} " , name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            logger.error("Interrupted!", e);
        }
        logger.info("completed service of the car: {} " , name);
        return this.charge;
    }
}

class ServiceBay1 implements Callable<Integer> {
    private Car1 car;

    public ServiceBay1(Car1 car) {
        this.car = car;
    }

    @Override
    public Integer call() throws Exception {
        return car.service();
    }
}


public class CarServiceTest2 {
    private static final Logger logger = LoggerFactory.getLogger(CarServiceTest2.class);
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<Callable<Integer>> callableList = new ArrayList<>();
        callableList.add(new ServiceBay1(new Car1("Tiago", "hatchback", 100)));
        callableList.add(new ServiceBay1(new Car1("Nexon", "SUV", 200)));
        callableList.add(new ServiceBay1(new Car1("Harrier", "SUV", 300)));
        callableList.add(new ServiceBay1(new Car1("Safari", "SUV", 400)));

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        int total = 0;
        List<Future<Integer>> futureList = executorService.invokeAll(callableList);
        for (Future<Integer> integerFuture : futureList) {
            total += integerFuture.get();
        }
        logger.info("All cars are serviced, total charge is : {} " , total);
        executorService.shutdown();
    }
}
