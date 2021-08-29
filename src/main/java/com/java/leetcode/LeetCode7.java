package com.java.leetcode;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LeetCode7 {
    public static void main(String[] args) {
        LeetCode7 code = new LeetCode7();
        log.info("{}",code.reverse(123));
    }

    public int reverse(int x) {
        int reversed = 0;
        int pop;
        if( x > Integer.MIN_VALUE/10 && x < Integer.MAX_VALUE/10) {
            while (x != 0) {
                pop = x % 10;
                x = x / 10;
                reversed = (reversed * 10) + pop;
            }
        }
        return reversed;
    }
}
