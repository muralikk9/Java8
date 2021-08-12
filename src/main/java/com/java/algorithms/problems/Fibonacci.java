package com.java.algorithms.problems;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Fibonacci {
    private static int[] memo = new int[1001];

    public static void fibonacci(int num) {
        int num1 = 0;
        int num2 = 1;
        int num3;
        int counter = 0;
        while (counter < num) {
            log.info(num1 + " ");
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            counter++;
        }
    }

    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    static int fibP(int n) {
        if (n <= 1)
            return n;
        else if (memo[n] == 0)
            return memo[n] = fibP(n - 1) + fibP(n - 2);
        return memo[n];
    }

    public static void main(String[] args) {
        //fibonacci(5);
        //log.info("{}", fib(100));
        log.info("{}", fibP(100));
    }
}
