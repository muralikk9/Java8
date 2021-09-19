package com.java.leetcode;

public class LeetCode1662 {
    public static void main(String[] args) {
        LeetCode1662 code = new LeetCode1662();
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(code.arrayStringsAreEqual(word1, word2));
    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        for (String s: word1) {
            builder1.append(s);
        }
        for (String s2: word2) {
            builder2.append(s2);
        }
        return builder1.toString().equals(builder2.toString());
    }
}
