package main.java.binarytree.traversal;

import main.java.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {

    public List<Integer> solution(TreeNode root){
        List<Integer> res = new ArrayList<>();
        traversal(root, res);
        return res;
    }

    void traversal(TreeNode root, List<Integer> res) {
        if(root == null) return;

        traversal(root.left, res);
        res.add(root.val);
        traversal(root.right, res);
    }

    public List<Integer> solution2(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null) return res;

        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {

            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                TreeNode node = stack.pop();
                res.add(node.val);
                curr  = node.right;
            }
        }
        return res;
    }
}
