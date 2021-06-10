package com.java.threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable {

    BlockingQueue blockingQueue;

    public Producer(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        try {
            blockingQueue.put(1);
            //Thread.sleep(200);
            blockingQueue.put(2);
            //Thread.sleep(200);
            blockingQueue.put(3);
            Thread.sleep(2000);
            blockingQueue.put(4);
            blockingQueue.put(5);
            Thread.sleep(2000);
            blockingQueue.put(6);
            blockingQueue.put(7);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer implements Runnable {

    BlockingQueue blockingQueue;

    public Consumer(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            while(true) {
                System.out.println("get from blocking queue: " + blockingQueue.take());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class BlockQueueTest {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue blockingQueue = new ArrayBlockingQueue<>(2);
        Producer producer = new Producer(blockingQueue);
        Consumer consumer = new Consumer(blockingQueue);
        new Thread(producer).start();
        new Thread(consumer).start();
        System.out.println("main thread finished execution");
    }
}
