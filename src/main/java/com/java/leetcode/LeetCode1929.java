package com.java.leetcode;

public class LeetCode1929 {
    public static void main(String[] args) {
        LeetCode1929 code = new LeetCode1929();
        int[] nums = {1,2,1};
        int[] result = code.getConcatenation(nums);
        for (int j : result) {
            System.out.println(j);
        }
    }

    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        System.arraycopy(nums, 0, result, 0, nums.length);

        for (int k = nums.length, j = 0; j < nums.length; j++, k++) {
            result[k] = nums[j];
        }
        return result;
    }
}
