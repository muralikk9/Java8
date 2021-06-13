package com.java.threads;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Customer {
    private static final Logger logger = LoggerFactory.getLogger(Customer.class);
    private int balance;

    public Customer(int balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(int amount) {
        logger.info("withdrawing amount");
        if(balance < amount) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            balance = balance - amount;
            logger.info("withdrawal is successful");
        }
    }

    public synchronized void deposit(int amount) {
        logger.info("depositing  amount");
        notify();
        balance = balance + amount;
        logger.info("deposit successful");

    }
}

public class CustomerTestDrive {
    public static void main(String[] args) {
        Customer customer = new Customer(10000);
        new Thread(() -> customer.withdraw(15000)).start();
        new Thread(() -> customer.deposit(5000)).start();
    }
}
