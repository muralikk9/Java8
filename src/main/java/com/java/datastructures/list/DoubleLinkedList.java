package com.java.datastructures.list;

// A complete working Java program to demonstrate all

// Class for Doubly Linked List
public class DoubleLinkedList {
    Node head; // head of list

    /* Doubly Linked list Node*/
    class Node {
        int data;
        Node prev;
        Node next;

        // Constructor to create a new node
        // next and prev is by default initialized as null
        Node(int d) { data = d; }
    }

    // Adding a node at the front of the list
    public void push(int newData)
    {
        /* 1. allocate node
         * 2. put in the data */
        Node newNode = new Node(newData);

        /* 3. Make next of new node as head and previous as NULL */
        newNode.next = head;
        newNode.prev = null;

        /* 4. change prev of head node to new node */
        if (head != null)
            head.prev = newNode;

        /* 5. move the head to point to the new node */
        head = newNode;
    }

    // Add a node before the given node
    public void insertBefore(Node nextNode, int newData)
    {
        /*Check if the given nx_node is NULL*/
        if(nextNode == null)
        {
            System.out.println("The given next node can not be NULL");
            return;
        }

        //Allocate node, put in the data
        Node newNode = new Node(newData);

        //Making prev of new node as prev of next node
        newNode.prev = nextNode.prev;

        //Making prev of next node as new node
        nextNode.prev = newNode;

        //Making next of new node as next node
        newNode.next = nextNode;

        //Check if new node is added as head
        if(newNode.prev != null)
            newNode.prev.next = newNode;
        else
            head = newNode;
    }

    /* Given a node as prev_node, insert
    a new node after the given node */
    public void insertAfter(Node prevNode, int newData)
    {

        /*1. check if the given prev_node is NULL */
        if (prevNode == null) {
            System.out.println("The given previous node cannot be NULL ");
            return;
        }

        /* 2. allocate node
         * 3. put in the data */
        Node newNode = new Node(newData);

        /* 4. Make next of new node as next of prev_node */
        newNode.next = prevNode.next;

        /* 5. Make the next of prev_node as newNode */
        prevNode.next = newNode;

        /* 6. Make prev_node as previous of newNode */
        newNode.prev = prevNode;

        /* 7. Change previous of newNode's next node */
        if (newNode.next != null)
            newNode.next.prev = newNode;
    }

    // Add a node at the end of the list
    void append(int newData)
    {
        /* 1. allocate node
         * 2. put in the data */
        Node newNode = new Node(newData);

        Node last = head; /* used in step 5*/

        /* 3. This new node is going to be the last node, so
         * make next of it as NULL*/
        newNode.next = null;

        /* 4. If the Linked List is empty, then make the new
         * node as head */
        if (head == null) {
            newNode.prev = null;
            head = newNode;
            return;
        }

        /* 5. Else traverse till the last node */
        while (last.next != null)
            last = last.next;

        /* 6. Change the next of last node */
        last.next = newNode;

        /* 7. Make last node as previous of new node */
        newNode.prev = last;
    }

    // This function prints contents of
    // linked list starting from the given node
    public void printlist(Node node)
    {
        Node last = null;
        System.out.println("Traversal in forward Direction");
        while (node != null) {
            System.out.print(node.data + " ");
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction");
        while (last != null) {
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }

    /* Driver program to test above functions*/
    public static void main(String[] args)
    {
        /* Start with the empty list */
        DoubleLinkedList dll = new DoubleLinkedList();

        // Insert 6. So linked list becomes 6->NULL
        dll.append(6);

        // Insert 7 at the beginning. So
        // linked list becomes 7->6->NULL
        dll.push(7);

        // Insert 1 at the beginning. So
        // linked list becomes 1->7->6->NULL
        dll.push(1);

        // Insert 4 at the end. So linked
        // list becomes 1->7->6->4->NULL
        dll.append(4);

        // Insert 8, after 7. So linked
        // list becomes 1->7->8->6->4->NULL
        dll.insertAfter(dll.head.next, 8);

        // Insert 5, before 8.So linked
        // list becomes 1->7->5->8->6->4
        dll.insertBefore(dll.head.next.next, 5);

        System.out.println("Created DLL is: ");
        dll.printlist(dll.head);
    }
}

