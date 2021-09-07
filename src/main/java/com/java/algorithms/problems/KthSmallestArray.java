package com.java.algorithms.problems;

import java.util.Arrays;

public class KthSmallestArray {
    public static void main(String[] args) {
        int arr[] = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println("kth element is:" + getKthElement(arr, k));

    }

    static int getKthElement(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k -1];
    }
}
