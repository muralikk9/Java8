package com.java.datastructures;

import java.util.EmptyStackException;

public class Queue<E> {
    private class Node<T> {
        Node<T> next;
        T data;

        public Node(T data) {
            this.data = data;
        }
    }

    Node<E> head;
    Node<E> tail;

    public void add(E data) {
        Node<E> newNode = new Node<>(data);
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        if (head == null) {
            head = tail;
        }
    }

    public E remove() {
        if (head == null) {
            throw new EmptyStackException();
        }
        E data = head.data;
        head = head.next;
        return data;
    }
}
