package com.java.leetcode;

import java.util.Arrays;

public class LeetCode1490 {
    public static void main(String[] args) {
        int[] target = {1, 2, 3, 4};
        int[] arr = {2, 4, 1, 3};
        LeetCode1490 code = new LeetCode1490();
        System.out.println(code.canBeEqual(target, arr));
    }

    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        return Arrays.equals(target, arr);
    }
}
