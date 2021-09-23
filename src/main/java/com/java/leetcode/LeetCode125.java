package com.java.leetcode;

import java.util.Locale;

public class LeetCode125 {

    public static void main(String[] args) {
        LeetCode125 leetCode125 = new LeetCode125();
        System.out.println(leetCode125.isPalindrome("ab_a"));
    }

    public boolean isPalindrome(String s) {
        s = s.replaceAll("\\W", "").toLowerCase();
        System.out.println(s);
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
