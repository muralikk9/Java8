package com.java.leetcode;

import lombok.extern.slf4j.Slf4j;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

@Slf4j
public class LeetCode896 {
    public static void main(String[] args) {
        LeetCode896 code = new LeetCode896();
        log.info("{}", code.isMonotonic(new int[] {1,2,2,3}));
        log.info("{}",code.isMonotonic(new int[] {6,5,4}));
        log.info("{}",code.isMonotonic(new int[] {1,3,2}));
        log.info("{}",code.isMonotonic(new int[] {1,2,4,5}));
        log.info("{}",code.isMonotonic(new int[] {6,5,4,4}));
    }

    public boolean isMonotonic(int [] nums){
        IntPredicate intPredicate = i -> nums[i] <= nums[i+1];
        IntPredicate intPredicate1 = i -> nums[i] >= nums[i+1];
        return IntStream.range(0, nums.length-1).allMatch(intPredicate)
                || IntStream.range(0, nums.length-1).allMatch(intPredicate1);
    }


}
