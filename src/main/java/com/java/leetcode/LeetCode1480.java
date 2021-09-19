package com.java.leetcode;

public class LeetCode1480 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        LeetCode1480 code = new LeetCode1480();
        int[] result = code.runningSum(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        return nums;
    }

}
