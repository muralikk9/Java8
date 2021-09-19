package com.java.datastructures.array;

import java.util.HashSet;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8};
        int[] c = sort(a, b);
        for (int j : c)
            System.out.println(j);
    }

    public static int[] sort(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        for (int j : a)
            set.add(j);
        for (int i : b)
            set.add(i);
        return set.stream().mapToInt(Number::intValue).toArray();
    }
}
