package com.java.examples;

import lombok.extern.slf4j.Slf4j;

import java.util.Stack;

@Slf4j
public class StackTestDrive {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        log.info("{}", stack);
        stack.peek();
        Integer elementRemoved = stack.pop();
        log.info("element removed: {} " , elementRemoved);
        log.info("{}", stack);
        stack.pop();
    }
}
