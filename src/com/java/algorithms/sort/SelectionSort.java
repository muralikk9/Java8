package com.java.algorithms.sort;

// complexity of the BubbleSort is O(n)
public class SelectionSort {

    public static int[] selectionSort(int[] arr) {
        int n = arr.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
        //int[] arr = {10,23,55,43,12};
        int[] arr = {2, 50, 11, 44, 77, 33, 99};
        print(arr);
        System.out.println("after sorting");
        print(selectionSort(arr));
    }
}
