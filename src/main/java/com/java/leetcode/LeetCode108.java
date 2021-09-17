package com.java.leetcode;



public class LeetCode108 {
    public static void main(String[] args) {
        int nums[] = {-10,-3,0,5,9};
        LeetCode108 leetCode108 = new LeetCode108();
        TreeNode result = leetCode108.sortedArrayToBST(nums);
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length ==0) return null;
        return convertArrayToBST(nums, 0, nums.length-1);

    }

    private TreeNode convertArrayToBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end-start)/2;
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left = convertArrayToBST(nums, start, mid -1);
        treeNode.right = convertArrayToBST(nums, mid+1, end);
        return treeNode;
    }
}
