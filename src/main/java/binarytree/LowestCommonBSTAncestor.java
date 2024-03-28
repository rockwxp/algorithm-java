package main.java.binarytree;

public class LowestCommonBSTAncestor {

    public TreeNode solution1(TreeNode root,TreeNode p,TreeNode q){
        if(root == null) return null;
        if (root.val < p.val && root.val < q.val) {
            return solution1(root.right, p, q);
        }

        if (root.val > p.val && root.val > q.val) {
            return solution1(root.left, p, q);
        }

        return root;
    }

    public TreeNode solution2(TreeNode root, TreeNode p, TreeNode q) {

        while (root != null) {
            if (root.val > p.val && root.val > q.val) {
                root = root.left;
            } else if (root.val < p.val && root.val < q.val) {
                root = root.right;
            } else {
                break;
            }
        }
        return root;
    }
}
