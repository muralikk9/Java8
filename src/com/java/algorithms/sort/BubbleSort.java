package com.java.algorithms.sort;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {
        int temp = 0;
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }




    public static void main(String[] args) {
        int[] arr = {10,23,55,43,12};
        print(arr);
        System.out.println("after sorting");
        print(bubbleSort(arr));
    }
}
