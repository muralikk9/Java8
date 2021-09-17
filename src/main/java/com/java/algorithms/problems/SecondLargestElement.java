package com.java.algorithms.problems;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 5, 10};
        Arrays.sort(arr);
        System.out.println("second largest elemnt is " + arr[arr.length-2]);
    }
}

