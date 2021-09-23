package com.java.datastructures.stack;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class StackTestDrive {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        log.info("is stack empty = {}", stack.isEmpty());
        log.info("size = {}", stack.size());
        log.info("peek = {}", stack.peek());
        log.info("pop = {}", stack.pop());
        log.info("is stack empty = {}", stack.isEmpty());
        log.info("size = {}", stack.size());
        log.info("pop = {}", stack.pop());
        log.info("size = {}", stack.size());
        log.info("is stack empty = {}", stack.isEmpty());

    }
}
