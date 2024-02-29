package main.java.binarytree;

public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int leftLeaves = sumOfLeftLeaves(root.left);
        int rightLeaves = sumOfLeftLeaves(root.right);

        if (root.left != null && root.left.left == null && root.left.right == null) {
            leftLeaves = root.left.val;
        }

        return leftLeaves + rightLeaves;




    }
}
