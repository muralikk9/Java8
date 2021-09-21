package com.java.leetcode;

public class LeetCode206 {
    public static void main(String[] args) {
        LeetCode206 leetCode206 = new LeetCode206();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        leetCode206.printList(head);
        leetCode206.printList(leetCode206.reverseList(head));
    }
    public ListNode reverseList(ListNode head) {
       ListNode prev = null;
       while(head != null) {
           ListNode nexNode = head.next;
           head.next = prev;
           prev = head;
           head = nexNode;
       }
       return prev;
    }

    public void printList(ListNode head) {
        ListNode current = head;
        while(current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
