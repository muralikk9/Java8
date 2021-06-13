package com.java.lamda;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

public class ArraySort {
    private static final Logger logger = LoggerFactory.getLogger(ArraySort.class);
    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        logger.info("Before Sort: {}", names);
        names.sort(String::compareTo);
        logger.info("After Sort: {}", names);

    }
}
