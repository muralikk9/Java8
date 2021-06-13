package com.java.misc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private static final Logger logger = LoggerFactory.getLogger(Solution.class);
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] input = {3, 2, 3};
        int[] output = solution.twoSum(input, 6);
        logger.info(output[0] + " " + output[1]);
    }

    //https://leetcode.com/problems/two-sum/solution/

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
