package com.java.algorithms.sort;

import lombok.extern.slf4j.Slf4j;

// complexity of the BubbleSort is O(n)
@Slf4j
public class SelectionSort {

    public static int[] selectionSort(int[] arr) {
        int n = arr.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIdx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[minIdx])
                    minIdx = j;
            // Swap the found minimum element with the first
            // element
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void print(int[] arr) {
        for (int j : arr) {
            log.info("{}", j);
        }
    }


    public static void main(String[] args) {
        int[] arr = {2, 50, 11, 44, 77, 33, 99};
        print(arr);
        log.info("after sorting");
        print(selectionSort(arr));
    }
}
