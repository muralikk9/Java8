package com.java.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode217 {
    public static void main(String[] args) {
        LeetCode217 code = new LeetCode217();
        int[] nums = {1,2,3,1};
        System.out.println(code.containsDuplicate(nums));

    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }
}
