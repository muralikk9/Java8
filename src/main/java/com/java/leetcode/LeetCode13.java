package com.java.leetcode;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/solution/
@Slf4j
public class LeetCode13 {
    public static void main(String[] args) {
        LeetCode13 leetCode13 = new LeetCode13();
        log.info("{}",leetCode13.romanToInt("IV"));

    }

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = map.get(s.charAt(s.length()-1));
        for (int i = s.length()-2; i >=0 ; i--) {
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {
                result -= map.get(s.charAt(i));
            } else {
                result += map.get(s.charAt(i));
            }
        }
        return result;
    }
}
