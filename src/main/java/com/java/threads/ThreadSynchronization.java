package com.java.threads;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Table {
    private static final Logger logger = LoggerFactory.getLogger(Table.class);
    public synchronized void print(int n) {

        for (int i = 0; i < 5; i++) {
            logger.info("{}", n*i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                logger.error("Interrupted!", e);
            }
        }
    }
}

class Thread2 extends Thread {
    Table table;
    public Thread2(Table table) {
        this.table = table;
    }
    @Override
    public void run() {
        table.print(1);
    }
}

class Thread3 extends Thread {
    Table table;
    public Thread3(Table table) {
        this.table = table;
    }
    @Override
    public void run() {
        table.print(100);
    }
}

public class ThreadSynchronization {
    public static void main(String[] args) {
        Table table = new Table();
        Thread2 thread2 = new Thread2(table);
        Thread3 thread3 = new Thread3(table);
        thread2.start();
        thread3.start();
    }

}
