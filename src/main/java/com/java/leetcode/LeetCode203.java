package com.java.leetcode;

public class LeetCode203 {
    public static void main(String[] args) {
        LeetCode203 leetCode203 = new LeetCode203();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);
        ListNode newhead = leetCode203.removeElements(head, 6);
        leetCode203.printList(newhead);
    }

    public ListNode removeElements(ListNode head, int val) {
        if (head != null && head.val == val) {
            head = head.next;
        }
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode nexNode = head.next;
            head.next = prev;
            prev = head;
            head = nexNode;
        }
        return prev;
    }

    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
