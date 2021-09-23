package com.java.datastructures.stack;

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

    public boolean isEmpty() {
        return head == null;
    }

    public void push(E data) {
        Node<E> newNode = new Node(data);
        if(head == null) {
            head = newNode;
        } else {
            Node<E> temp = head;
            head = newNode;
            newNode.next = temp;
        }
    }

    public E pop() {
        E data;
        if (head == null) {
            throw new EmptyStackException();
        } else {
            data = head.data;
            head = head.next;
        }
        return  data;
    }

    public E peek() {
        if (head == null) {
            throw new EmptyStackException();
        } else {
            return head.data;
        }
    }

    public int size() {
        int count = 0;
        if (head == null) {
            return 0;
        } else {
            Node temp = head;
            while(temp != null) {
                count++;
                temp = temp.next;
            }
        }
        return count;
    }






}
