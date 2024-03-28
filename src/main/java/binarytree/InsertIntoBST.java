package main.java.binarytree;

public class InsertIntoBST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) {
            TreeNode newNode = new TreeNode(val);
            return newNode;
        }

        if (val < root.val) {
          root.left =  insertIntoBST(root.left, val);
        }
        if (val > root.val) {
            root.right = insertIntoBST(root.right,val);
        }

        return root;
    }
}
