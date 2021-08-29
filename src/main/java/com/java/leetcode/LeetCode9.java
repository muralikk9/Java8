package com.java.leetcode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LeetCode9 {
    public static void main(String[] args) {
        LeetCode9 leetCode9 = new LeetCode9();
        log.info("{}", leetCode9.isPalindrome(121));

    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else {
            int reversed = 0;
            int pop;
            int y = x;
            while (x > 0) {
                pop = x % 10;
                x = x / 10;
                reversed = (reversed * 10) + pop;
            }
            return reversed == y;
        }
    }

}
