package com.java.threads;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Runnable1 implements Runnable {
    private static final Logger logger = LoggerFactory.getLogger(Runnable1.class);
    @Override
    public void run() {
        logger.info("Runnable1 is running");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(() -> logger.info("Runnable1 is running"));
        thread.start();
    }
}
