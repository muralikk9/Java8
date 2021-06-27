package com.java.datastructures;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LinkedListTestDrive {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFront(2);
        list.addFront(4);
        list.addBack(1);
        list.addBack(3);
        list.print();
        log.info("list size is :{}" ,list.size());
        log.info("data of first element :{}", list.getFirst());
    }
}
