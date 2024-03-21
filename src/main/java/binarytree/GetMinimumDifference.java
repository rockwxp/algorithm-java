package main.java.binarytree;

import java.util.ArrayList;
import java.util.List;

public class GetMinimumDifference {

    private int result = Integer.MAX_VALUE;
    private TreeNode preNode;
    private final List<Integer> arr = new ArrayList<>();
    public int getMinimumDifference(TreeNode root){
        traversal(root);
        return result;
    }

    public void traversal(TreeNode root){
        if(root == null) return;

        traversal(root.left);

        if (preNode != null) {
            result = Math.min(result, Math.abs(root.val - preNode.val));
        }

        preNode = root;

        traversal(root.right);
    }

    public void traversal2(TreeNode root){
        if(root==null) return;
        traversal2(root.left);
        arr.add(root.val);
        traversal2(root.right);
    }

    public int getMinimumDifference2(TreeNode root){
        traversal2(root);
        for (int i = 1; i < arr.size(); i++) {
            result = Math.min(result, arr.get(i) - arr.get(i - 1));
        }
        return result;
    }


}
