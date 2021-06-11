package com.java.algorithms.search;

public class BinarySearch {


    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int last = arr.length - 1;
        int result = binarySearch(arr, 0, last, 50);
        if (result == -1) {
            System.out.println("search element not found in array");
        } else {
            System.out.println("search element found at index: " + result);
        }
    }

    private static int binarySearch(int[] arr, int first, int last, int key) {
       if(last >= first) {
           int mid = first + (last-first)/2;
           if(arr[mid] == key) {
               return mid;
           }
           if(arr[mid] > key) {
               return binarySearch(arr, first, mid-1, key);
           } else {
               return  binarySearch(arr, mid+1, last, key);
           }
        }
        return -1;
    }
}
