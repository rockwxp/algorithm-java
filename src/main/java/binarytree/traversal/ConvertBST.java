package main.java.binarytree.traversal;

import main.java.binarytree.TreeNode;

public class ConvertBST {
    private int pre = 0;
    public TreeNode convertBST(TreeNode root){
        traversal(root);
        return root;
    }

    private void traversal(TreeNode root){
        if(root == null) return;
        traversal(root.right);
        root.val+=pre;
        pre = root.val;
        traversal(root.left);

    }
}
