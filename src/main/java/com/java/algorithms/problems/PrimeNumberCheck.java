package com.java.algorithms.problems;

import lombok.extern.slf4j.Slf4j;

import java.util.stream.IntStream;

@Slf4j
public class PrimeNumberCheck {
    public static void main(String[] args) {
      log.info("is prime: {}", isPrime(13));
    }

    public  static boolean isPrime(int number) {
        if(number <=1) {
            return false;
        }
        return IntStream.range(2, number).noneMatch(i->  number % i == 0);
    }
}
