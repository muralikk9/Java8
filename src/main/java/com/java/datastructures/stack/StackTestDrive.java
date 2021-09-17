package com.java.datastructures.stack;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class StackTestDrive {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        log.info("{}", stack.isEmpty());
        log.info("{}", stack.size());
        log.info("{}", stack.peek());
        log.info("{}", stack.pop());
        log.info("{}", stack.isEmpty());
        log.info("{}", stack.size());
        log.info("{}", stack.pop());
        log.info("{}", stack.size());

    }
}
