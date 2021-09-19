package com.java.leetcode;

public class LeetCode53 {
    public static void main(String[] args) {
        LeetCode53 code = new LeetCode53();
        int[] nums = {5,4,-1,7,8};
        int result = code.maxSubArray(nums);
        System.out.println(result);
    }

    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = maxSum;
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(currentSum + nums[i], nums[i]);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
}
