package com.java.algorithms.problems;

public class FirstAndLastPositionArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 5, 5, 7, 123, 125 };
        FirstAndLastPositionArray array = new FirstAndLastPositionArray();
        array.printFirstAndLast(arr, 7);
    }

    public void printFirstAndLast(int[] arr, int num) {
        int first = -1;
        int last = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != num){
                continue;
            } else {
                if(first == -1) {
                    first = i;
                }
                last = i;
            }
        }

        if(first == -1) {
            System.out.println(num + " is not found");
        } else {
            System.out.println(num + " is found first at " + first);
            System.out.println(num + " is found last at " + last);
        }

    }
}
