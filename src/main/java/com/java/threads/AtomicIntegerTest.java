package com.java.threads;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest {
    private static final Logger logger = LoggerFactory.getLogger(AtomicIntegerTest.class);
    static class Counter {
        private AtomicInteger integer = new AtomicInteger(0);
        public void increment() {
            integer.getAndIncrement();
        }
        public int  getCount() {
            return integer.get();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final Counter counter = new Counter();
        for (int i = 0; i < 1000; i++) {
            new Thread(counter::increment).start();
        }
        Thread.sleep(100);
        logger.info("final count : {}" ,  counter.getCount());
    }
}
