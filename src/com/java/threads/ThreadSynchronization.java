package com.java.threads;

class Table {
    public synchronized void print(int n) {

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
