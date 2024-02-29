package main.java.binarytree;
//https://leetcode.cn/problems/invert-binary-tree/
public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;

        TreeNode curr = root;

        TreeNode tempNode = curr.left;

        curr.left = curr.right;
        curr.right = tempNode;
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
