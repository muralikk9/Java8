package com.java.leetcode;

public class LeetCode21 {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(4);
        ListNode listNode2 = new ListNode(1);
        listNode2.next = new ListNode(3);
        listNode2.next.next = new ListNode(4);
        LeetCode21 leetCode21 = new LeetCode21();
        ListNode resultNode = leetCode21.mergeTwoLists(listNode1, listNode2);
        //leetCode21.printNode(leetCode21.addItem(listNode1));
        leetCode21.printNode(resultNode);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        while (l1.next != null && l2.next != null) {
            if (l1.val <= l2.val) {
                listNode.next = l1;
                listNode = listNode.next;
                l1 = l1.next;
            } else {
                listNode.next = l2;
                listNode = listNode.next;
                l2 = l2.next;
            }
        }
        return listNode;
    }

    public void printNode(ListNode l3) {
        while (l3 != null) {
            System.out.println(l3.val);
            l3 = l3.next;
        }
    }

    public ListNode addItem(ListNode l1) {
        ListNode listNode = new ListNode(0);
        while (l1.next != null) {
            listNode.next = l1;
            l1 = l1.next;
        }
        return listNode;
    }

}


