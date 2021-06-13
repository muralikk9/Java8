package com.java.threads;

import java.util.concurrent.CountDownLatch;

class Worker {
    public void print(int n){
        for (int i = 0; i < 5; i++) {
            System.out.println(n*i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
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
            e.printStackTrace();
        }
        System.out.println("threads finished execution");
    }

}
