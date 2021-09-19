package com.java.leetcode;

//sort arrays by parity
public class LeetCode905 {
    public static void main(String[] args) {
        LeetCode905 code = new LeetCode905();
        int[] nums = {3,1,2,4};
        int[] result = code.sortArrayByParity(nums);
        for (int n: result) {
            System.out.print(n + " ");
        }
    }

    public int[] sortArrayByParity(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2 ==0) {
                int temp = nums[index];
                nums[index++] = nums[i];
                nums[i] = temp;
            }
        }
        return  nums;
    }
}
