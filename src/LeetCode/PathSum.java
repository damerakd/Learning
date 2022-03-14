package LeetCode;

import Trees.Node;

//leetcode 112. PathSum

//Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path
// such that adding up all the values along the path equals targetSum. A leaf is a node with no children.


public class PathSum {

    public boolean hasPathSum(Node root, int targetSum) {

        return hasPathSumHelper(root, targetSum, 0);
    }

    boolean hasPathSumHelper(Node root, int targetSum, int sum) {
        if (root == null) return false;

        if (root.left == null && root.right == null) {
            if ((sum + root.data) == targetSum) {
                return true;
            }
        }
        return hasPathSumHelper(root.left, targetSum, sum + root.data) || hasPathSumHelper(root.right, targetSum, sum + root.data);

    }
}
