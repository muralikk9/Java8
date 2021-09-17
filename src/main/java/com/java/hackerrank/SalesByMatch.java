package com.java.hackerrank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SalesByMatch {
    public static void main(String[] args) {
       List<Integer> arr = Arrays.asList(1,2,1,2,1,3,2);
       int n = 7;
        System.out.println(sockMerchant(n, arr));
    }

    public static int sockMerchant(int n, List<Integer> arr) {
        int[] c = arr.stream().mapToInt(i-> i).toArray();
        Set<Integer> colors = new HashSet<>();
        int pairs = 0;

        for (int i = 0; i < n; i++) {
            if (!colors.contains(c[i])) {
                colors.add(c[i]);
            } else {
                pairs++;
                colors.remove(c[i]);
            }
        }
        return pairs;
    }
}
