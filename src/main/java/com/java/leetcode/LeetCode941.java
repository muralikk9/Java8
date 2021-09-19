package com.java.leetcode;

public class LeetCode941 {
    public static void main(String[] args) {
        int[] nums = {2,0,2};
        LeetCode941 code = new LeetCode941();
        System.out.println(code.validMountainArray(nums));

    }

    public boolean validMountainArray(int[] arr) {
        boolean upMountain = false;
        boolean downMountain = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > 0 && arr[i+1] > 0){
                if (arr[i] > arr[i + 1]) {
                    upMountain = true;
                } else if (arr[i] < arr[i + 1]) {
                    downMountain = true;
                }
            }
        }
        return downMountain && upMountain;
    }
}
