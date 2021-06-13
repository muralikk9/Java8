package com.java.examples;

import java.util.Arrays;
import java.util.List;

public class LinkedListTestDrive {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc", "cde", "def");
        list.forEach(System.out::println);
    }
}
