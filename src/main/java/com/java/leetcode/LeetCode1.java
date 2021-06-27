package com.java.leetcode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/solution/
public class LeetCode1 {
    private static final Logger logger = LoggerFactory.getLogger(LeetCode1.class);
    public static void main(String[] args) {
        LeetCode1 solution = new LeetCode1();
        int[] input = {2,7,11,15};
        int[] output = solution.twoSum(input, 9);
        logger.info("{}, {}" ,output[0], output[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
