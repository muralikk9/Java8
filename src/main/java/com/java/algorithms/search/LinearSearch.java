package com.java.algorithms.search;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// complexity of the linear search is O(n)
public class LinearSearch {
    private static final Logger logger = LoggerFactory.getLogger(LinearSearch.class);
    private static int search(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 10, 20};
        int result = search(a, 10);
        if (result == -1) {
            logger.info("search element not found");
        } else {
            logger.info("search element found at : " + result);
        }
    }
}
