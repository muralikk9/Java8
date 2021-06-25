package com.java.datastructures;

import java.util.EmptyStackException;

public class Stack<E> {
    private class Node<E> {
        E data;
        Node<E> next;

        public Node(E data) {
            this.data = data;
        }
    }

    Node<E> head;
    int size;

    public void push(E data) {
        Node newNode = new Node(data);
        newNode.data = head;
        head = newNode;
        size++;
    }

    public E pop() {
        if (head == null) {
            throw new EmptyStackException();
        }
        E data = head.data;
        if (head.next != null)
            head = head.next;
        size--;
        return data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E peek() {
        return head.data;
    }

}
