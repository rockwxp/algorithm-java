package main.java.binarytree;

public class DeleteNode {

    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;

        if (root.val == key) {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left != null && root.right == null) {
                return root.left;
            } else if (root.left == null && root.right != null) {
               return root.right;
            } else {
                TreeNode curr = root.right;
                while (curr.left != null) {
                    curr = curr.left;
                }
                curr.left = root.left;
                return root.right;
            }

        }


        if(key < root.val) root.left = deleteNode(root.left, key);
        if(key > root.val) root.right = deleteNode(root.right, key);
        return root;
    }
}
