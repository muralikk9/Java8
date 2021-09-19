package com.java.test;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] input = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(input, target);
        System.out.println(result[0] + " " + result[1]);

    }

    public static int[] twoSum(int[] input, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[0];
        for (int i = 0; i < input.length; i++) {
            int key = target - input[i];
            if(map.containsKey(key)){
                return new int[] {map.get(key), i};
            }
            map.put(input[i], i);
        }
        return arr;
    }
}
