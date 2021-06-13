package com.java.algorithms.sort;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// complexity of the BubbleSort is O(n)
public class BubbleSort {

    private static final Logger logger = LoggerFactory.getLogger(BubbleSort.class);

    public static int[] bubbleSort(int[] arr) {
        int temp = 0;
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            logger.info(String.valueOf(arr[i]));
        }
    }


    public static void main(String[] args) {
        int[] arr = {2, 50, 11, 44, 77, 33, 99};
        print(arr);
        logger.info("after sorting");
        print(bubbleSort(arr));
    }
}
