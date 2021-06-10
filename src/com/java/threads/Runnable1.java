package com.java.threads;

public class Runnable1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable1 is running");
    }

    public static void main(String[] args) {
        Runnable runnable = new Runnable1();
        //Thread thread  = new Thread(runnable);
        Thread thread = new Thread(() -> System.out.println("Runnable1 is running"));
        thread.start();
    }
}
