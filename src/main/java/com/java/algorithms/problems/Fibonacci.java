package com.java.algorithms.problems;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Fibonacci {
    public static void fibonacci(int num) {
       int num1 = 0;
       int num2 = 1;
       int num3;
       int counter = 0;
       while(counter < num) {
           log.info(num1 + " ");
           num3 = num1 + num2;
           num1 = num2;
           num2 = num3;
           counter++;
       }
    }
    public static void main(String[] args) {
        fibonacci(5);
    }
}
