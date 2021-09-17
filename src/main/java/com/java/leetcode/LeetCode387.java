package com.java.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode387 {
    public static void main(String[] args) {
        LeetCode387 leetCode387 = new LeetCode387();
        System.out.println(leetCode387.firstUniqChar("loveleetcode"));

    }

    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), i);
            } else {
                map.put(s.charAt(i), -1);
            }
        }
        Integer min = Integer.MAX_VALUE;
        for (char c : map.keySet()) {
            if(map.get(c) > -1 && map.get(c) < min) {
                min = map.get(c);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
