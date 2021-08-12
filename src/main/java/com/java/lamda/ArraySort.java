package com.java.lamda;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

@Slf4j
public class ArraySort {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        log.info("Before Sort: {}", names);
        names.sort(String::compareTo);
        log.info("After Sort: {}", names);

    }
}
