package com.java.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode136 {

    public static void main(String[] args) {
        LeetCode136 leetCode136 = new LeetCode136();
        int[] nums = {2, 2, 1};
        System.out.println(leetCode136.singleNumber(nums));
    }

    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (Integer number : nums) {
            if (!set.contains(number)) {
                set.add(number);
            } else {
                set.remove(number);
            }
        }
        return set.stream().findFirst().get();

    }
}
