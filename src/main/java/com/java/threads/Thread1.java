package com.java.threads;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Thread1 extends  Thread{

    private static final Logger logger = LoggerFactory.getLogger(Thread1.class);

    @Override
    public void run() {
        try {
            Thread.sleep(10000);
            logger.info("my Thread is running");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
       Thread1 thread = new Thread1();
        thread.start();
    }
}
