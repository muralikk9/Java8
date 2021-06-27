package com.java.threads;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

@Slf4j
class Producer implements Runnable {

    BlockingQueue<Integer> blockingQueue;

    public Producer(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        try {
            blockingQueue.put(1);
            blockingQueue.put(2);
            blockingQueue.put(3);
            Thread.sleep(2000);
            blockingQueue.put(4);
            blockingQueue.put(5);
            Thread.sleep(2000);
            blockingQueue.put(6);
            blockingQueue.put(7);

        } catch (InterruptedException e) {
            log.error("Interrupted!", e);
        }
    }
}

class Consumer implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(Consumer.class);

    BlockingQueue<Integer> blockingQueue;

    public Consumer(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            while(true) {
                logger.info("get from blocking queue: {}" , blockingQueue.take());
            }
        } catch (InterruptedException e) {
            logger.error("Interrupted!", e);
        }
    }
}

public class BlockQueueTest {
    private static final Logger logger = LoggerFactory.getLogger(BlockQueueTest.class);
    public static void main(String[] args)  {
        BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(2);
        Producer producer = new Producer(blockingQueue);
        Consumer consumer = new Consumer(blockingQueue);
        new Thread(producer).start();
        new Thread(consumer).start();
        logger.info("main thread finished execution");
    }
}
