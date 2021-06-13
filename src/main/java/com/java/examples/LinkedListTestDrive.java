package com.java.examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

public class LinkedListTestDrive {
    private static final Logger logger = LoggerFactory.getLogger(LinkedListTestDrive.class);
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc", "cde", "def");
        list.forEach(logger::info);
    }
}
