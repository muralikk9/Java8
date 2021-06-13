package com.java.algorithms.search;

// complexity of the linear search is O(n)
public class LinearSearch {

    private static int search(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 10, 20};
        int result = search(a, 10);
        if (result == -1) {
            System.out.println("search element not found");
        } else {
            System.out.println("search element found at : " + result);
        }
    }
}
