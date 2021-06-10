package com.java.threads;

class Customer {
    private int balance;

    public Customer(int balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(int amount) {
        System.out.println("withdrawing amount");
        if(balance < amount) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            balance = balance - amount;
            System.out.println("withdrawal is successful");
        }
    }

    public synchronized void deposit(int amount) {
        System.out.println("depositing  amount");
        notify();
        balance = balance + amount;
        System.out.println("deposit successful");

    }
}

public class CustomerTestDrive {
    public static void main(String[] args) {
        Customer customer = new Customer(10000);
        new Thread(() -> customer.withdraw(15000)).start();
        new Thread(() -> customer.deposit(5000)).start();
    }
}
