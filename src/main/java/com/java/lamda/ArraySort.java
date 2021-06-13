package com.java.lamda;

import java.util.Arrays;
import java.util.List;

public class ArraySort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        System.out.println("before sort" + names);
        names.sort(String::compareTo);
        System.out.println("after sort" + names);

    }
}
