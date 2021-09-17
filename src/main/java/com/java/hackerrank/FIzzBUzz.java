package com.java.hackerrank;

public class FIzzBUzz {
    public static void main(String[] args) {
        //fizzBuzz(17);
        String s1 = "12";
        String s2 = "123";
        System.out.println(s1.compareTo(s2));
    }
    public static void fizzBuzz(int n) {
        for (int i = 1; i < n; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0) {
                System.out.println("Fizz");
            } else if(i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
