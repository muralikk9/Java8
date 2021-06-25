package com.java.datastructures;

public class LinkedListTestDrive {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFront(2);
        list.addFront(4);
        list.addBack(1);
        list.addBack(3);
        list.print();
        System.out.println("list size is :" + list.size());
        System.out.println("data of first element :" + list.getFirst());
    }
}
