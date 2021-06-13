package com.java.threads;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTestDrive {
    private static final Logger logger = LoggerFactory.getLogger(ExecutorTestDrive.class);
    public static void main(String[] args) {
        List<Runnable> runnableList = new ArrayList<>();
        runnableList.add(() -> logger.info("Runnable1 is running"));
        runnableList.add(() -> logger.info("Runnable2 is running"));
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        runnableList.stream().forEach(executorService::execute);
        executorService.shutdown();
    }
}
