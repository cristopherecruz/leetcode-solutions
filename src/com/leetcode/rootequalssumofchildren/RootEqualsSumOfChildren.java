package com.leetcode.rootequalssumofchildren;

//https://leetcode.com/problems/root-equals-sum-of-children/
public class RootEqualsSumOfChildren {

    static void main() {

        TreeNode node1 = new TreeNode(5, new TreeNode(3), new TreeNode(1));

        Solution solution = new Solution();
        System.out.println(solution.checkTree(node1));

    }

    static class Solution {
        public boolean checkTree(TreeNode root) {
            int toor = root.val;
            int left = root.left.val;
            int right = root.right.val;

            return (left + right) == toor;
        }
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
