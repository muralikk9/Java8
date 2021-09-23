package com.java.leetcode;

public class LeetCode234 {
    public static void main(String[] args) {
        LeetCode234 leetCode234 = new LeetCode234();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        System.out.println(leetCode234.isPalindrome(head));

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

    public boolean isPalindrome(ListNode head) {
        ListNode original = head;
        ListNode reverse = reverseList(head);
        while(original != null && reverse!= null) {
            if(original.val != reverse.val) {
                return false;
            }
            original = original.next;
            reverse = reverse.next;
        }
        return true;
    }
}
