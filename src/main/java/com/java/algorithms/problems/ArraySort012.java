package com.java.algorithms.problems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArraySort012 {
    private static final Logger logger = LoggerFactory.getLogger(ArraySort012.class);

    public static void main(String[] args) {
        int[] arr = {2, 1, 0, 0, 2, 1, 1, 1};
        print(sort(arr));

    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            logger.info("{}", arr[i]);
        }
    }

    public static int[] sort(int[] arr) {
        int case0 = 0;
        int case1 = 0;
        int case2 = 0;
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 0:
                    case0++;
                    break;
                case 1:
                    case1++;
                    break;
                case 2:
                    case2++;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + arr[i]);
            }
        }
        i = 0;
        while (case0 > 0) {
            arr[i++] = 0;
            case0--;
        }
        while (case1 > 0) {
            arr[i++] = 1;
            case1--;
        }
        while (case2 > 0) {
            arr[i++] = 2;
            case2--;
        }
        return arr;
    }
}
