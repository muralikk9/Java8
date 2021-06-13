package com.java.algorithms.search;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// complexity of the Binary search is O(n)
public class BinarySearch {
    private static final Logger logger = LoggerFactory.getLogger(BinarySearch.class);

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int last = arr.length - 1;
        int result = binarySearch(arr, 0, last, 50);
        if (result == -1) {
            logger.info("search element not found in array");
        } else {
            logger.info("search element found at index: " + result);
        }
    }

    private static int binarySearch(int[] arr, int first, int last, int key) {
        if (last >= first) {
            int mid = first + (last - first) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                return binarySearch(arr, first, mid - 1, key);
            } else {
                return binarySearch(arr, mid + 1, last, key);
            }
        }
        return -1;
    }
}
