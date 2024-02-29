package main.java.binarytree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

// https://leetcode.cn/problems/minimum-depth-of-binary-tree/
public class MinDepth {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);

        if (root.left == null && root.right != null) {
            return rightDepth + 1;
        }
        if (root.left != null && root.right == null) {
            return leftDepth + 1;
        }

        return Math.min(leftDepth,rightDepth) + 1;
    }


}
