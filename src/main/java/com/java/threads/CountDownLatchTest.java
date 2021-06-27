package com.java.threads;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CountDownLatch;

class Worker {
    private static final Logger logger = LoggerFactory.getLogger(Worker.class);
    public void print(int n){
        for (int i = 0; i < 5; i++) {
            logger.info(String.valueOf(n*i));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                logger.error("Interrupted!", e);
            }
        }
    }
}

class Thread4 extends Thread {
    Worker worker;
    CountDownLatch countDownLatch;
    public Thread4(Worker worker, CountDownLatch countDownLatch) {
        this.worker = worker;
        this.countDownLatch = countDownLatch;
    }
    @Override
    public void run() {
        worker.print(1);
        countDownLatch.countDown();
    }
}

class Thread5 extends Thread {
    Worker worker;
    CountDownLatch countDownLatch;
    public Thread5(Worker worker, CountDownLatch countDownLatch) {
        this.worker = worker;
        this.countDownLatch = countDownLatch;
    }
    @Override
    public void run() {
        worker.print(100);
        countDownLatch.countDown();
    }
}

public class CountDownLatchTest {
    private static final Logger logger = LoggerFactory.getLogger(CountDownLatchTest.class);
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        Worker worker = new Worker();
        Thread4 thread4 = new Thread4(worker, countDownLatch);
        Thread5 thread5 = new Thread5(worker, countDownLatch);
        thread4.start();
        thread5.start();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            logger.error("Interrupted!", e);
        }
        logger.info("threads finished execution");
    }

}
