package com.java.examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTestDrive {
    private static final Logger logger = LoggerFactory.getLogger(QueueTestDrive.class);
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(4);
        queue.add(2);
        queue.add(3);
        queue.add(1);
        queue.poll();
        queue.stream().forEach(i -> logger.info(String.valueOf(i)));



    }
}
