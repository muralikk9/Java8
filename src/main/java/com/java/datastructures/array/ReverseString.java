package com.java.datastructures.array;

public class ReverseString {
    public static void main(String[] args) {
        String name = "murali";
        System.out.println(reverse(name));
    }

    public static String reverse(String input) {
        char[] try1 = input.toCharArray();
        char[] output = new char[try1.length];
        int j = 0;

        for (int i = try1.length - 1; i >= 0; i--) {
            output[j++] = try1[i];
        }

        return new String(output);
    }
}
