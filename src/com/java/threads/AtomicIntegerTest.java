package com.java.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest {

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
        System.out.println("final count :" + counter.getCount());
    }
}
