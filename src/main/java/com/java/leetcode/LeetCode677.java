package com.java.leetcode;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class LeetCode677 {
    Map<String, Integer> map;
    public LeetCode677() {
        map = new HashMap<>();
    }
    private int sum(String key) {
        return map.keySet().stream().filter(k -> k.contains(key)).mapToInt(k -> map.get(k)).sum();
    }
    private void insert(String key, int value) {
        map.put(key, value);
    }

    public static void main(String[] args) {
        LeetCode677 leetCode677 = new LeetCode677();
        leetCode677.insert("apple", 3);
        System.out.println(leetCode677.sum("ap"));
        leetCode677.insert("app", 2);
        System.out.println(leetCode677.sum("ap"));

    }

}
