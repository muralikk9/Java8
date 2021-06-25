package com.java.datastructures;

import lombok.extern.slf4j.Slf4j;

import java.util.Stack;

@Slf4j
public class QueueTestDrive {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.add(1);
        queue.add(2);
        log.info("{}", queue.remove());

    }
}
