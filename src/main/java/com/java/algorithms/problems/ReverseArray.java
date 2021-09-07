package com.java.algorithms.problems;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        printArray(arr, 6);
        reverseArray(arr, 0, 5);
        System.out.print("Reversed array is \n");
        printArray(arr, 6);
    }

    private static void reverseArray(int[] arr, int start, int end) {
        int temp;
        while(start < end) {
            temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
        System.out.println();
    }

    private static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
        }
    }

    public static class Anagram {
        public static void main(String[] args) {
            String str1 = "west";
            String str2 = "ewst";
            System.out.println("isAnagram: " + isAnagram(str1, str2));
        }

        static boolean isAnagram(String str1, String str2) {
            if(str1.length() != str2.length()) {
                return false;
            }
            char char1[] = str1.toCharArray();
            char char2[] = str2.toCharArray();
            Arrays.sort(char1);
            Arrays.sort(char2);
            return Arrays.equals(char1, char2);
        }
    }

    public static class BinaryArraySort {
        public static void main(String[] args) {
            int[] arr = {1,0,1,1,1,1,1,0,0,0};
            print(sort(arr));
        }

        private static void print(int[] arr) {
            System.out.println("array after sorting");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
        }

        private static int[] sort(int[] arr) {

            int case0 = 0;
            int case1 = 0;

            for (int i = 0; i < arr.length; i++) {
                switch (arr[i]) {
                    case 0 :
                        case0++;
                        break;
                    case 1 :
                        case1++;
                        break;
                    default:
                        throw new RuntimeException("Invalid input");
                }
            }
            int i = 0;
            while(case0 > 0) {
                arr[i++] = 0;
                case0--;
            }
            while(case1 > 0) {
                arr[i++] = 1;
                case1--;
            }
            return arr;
        }
    }
}
