package com.java.examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Stack;

public class StackTestDrive {
    private static final Logger logger = LoggerFactory.getLogger(StackTestDrive.class);
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        logger.info(String.valueOf(stack));
        stack.peek();
        Integer elementRemoved = stack.pop();
        logger.info("element removed " + elementRemoved);
        logger.info(String.valueOf(stack));
        stack.pop();
    }
}
