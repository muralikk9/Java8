package com.java.examples;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTestDrive {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(4);
        queue.add(2);
        queue.add(3);
        queue.add(1);
        queue.poll();
        queue.stream().forEach(System.out::println);



    }
}
