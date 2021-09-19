package com.java.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode88 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        LeetCode88 code = new LeetCode88();
        code.merge(nums1, m, nums2, n);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            list.add(nums1[i]);
        }
        for (int j = 0; j < n; j++) {
            list.add(nums2[j]);
        }
        int[] finalArray= list.stream().mapToInt(Number::intValue).toArray();
        Arrays.sort(finalArray);
    }
}
