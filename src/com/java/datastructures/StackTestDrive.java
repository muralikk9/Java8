package com.java.datastructures;

import java.util.Stack;

public class StackTestDrive {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        System.out.println(stack);
        stack.peek();
        Integer elementRemoved = stack.pop();
        System.out.println("element removed " + elementRemoved);
        System.out.println(stack);
        stack.pop();
    }
}
