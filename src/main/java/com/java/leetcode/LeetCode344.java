package com.java.leetcode;

public class LeetCode344 {
    public static void main(String[] args) {
        LeetCode344 leetCode344 = new LeetCode344();
       char[] s = {'h','e','l','l','o'};
       leetCode344.reverseString(s);
    }

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length -1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
