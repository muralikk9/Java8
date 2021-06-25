package com.java.datastructures;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LinkedList<E> {
    private class Node<E> {
        Node next;
        E data;

        public Node(E data) {
            this.data = data;
        }
    }

    Node head;

    public void addFront(E data) {
        Node<E> newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addBack(E data) {
        Node<E> newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newnode;
    }

    public int size() {
        if (head == null) {
            return 0;
        }
        int count = 1;
        Node current = head;
        while (current.next != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    public E getFirst() {
        return (E) head.data;
    }

    public void print() {
        if (head == null) {
            throw new RuntimeException("list is empty");
        }
        Node current = head;
        while (current != null) {
            log.info("{}", current.data);
            current = current.next;
        }
    }
}
