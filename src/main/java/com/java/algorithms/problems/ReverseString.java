package com.java.algorithms.problems;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String inputString = "skeegrofskeeg";
        String outputString = reverseCharacterArray(inputString.toCharArray());
        System.out.println("result " + outputString);
    }

    private static String reverseCharacterArray(char[] c) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < c.length; i++) {
            stack.push(c[i]);
        }
        for (int i = 0; i < c.length; i++) {
            c[i] = stack.pop();
        }
        return String.valueOf(c);
    }

}
