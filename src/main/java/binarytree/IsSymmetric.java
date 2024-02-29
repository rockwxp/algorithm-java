package main.java.binarytree;

public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        return  compare(root.left,root.right);
    }

    public boolean compare(TreeNode left, TreeNode right){

        if (left == null && right == null) {
            return true;
        }

        if (left == null && right != null) {
            return false;
        }
        if (left != null && right == null) {
            return false;
        }

        if(left.val != right.val){
            return false;
        }

        boolean outside = compare(left.left, right.right);
        boolean inside = compare(left.right, right.left);
        return outside&&inside;
    }
}
