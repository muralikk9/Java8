package com.java.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTestDrive {
    public static void main(String[] args) {
        List<Runnable> runnableList = new ArrayList<>();
        runnableList.add(() -> System.out.println("Runnable1 is running"));
        runnableList.add(() -> System.out.println("Runnable2 is running"));
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        runnableList.stream().forEach(item -> executorService.execute(item));
        executorService.shutdown();
    }
}
