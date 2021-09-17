package com.java.algorithms.problems;

public class MaxSumArray {
    public static void main(String[] args) {
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is " +maxSubArraySum(a));
    }

    static int maxSubArraySum(int a[]) {
        int max = Integer.MIN_VALUE;
        int maxEnding = 0;

        for (int i = 0; i < a.length; i++) {
            maxEnding = maxEnding + a[i];
            if (max < maxEnding)
                max = maxEnding;
            if (maxEnding < 0)
                maxEnding = 0;
        }
        return max;
    }
}
