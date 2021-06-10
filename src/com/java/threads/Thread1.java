package com.java.threads;

public class Thread1 extends  Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(10000);
            System.out.println("my Thread is running");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
       Thread1 thread = new Thread1();
        thread.start();
    }
}
