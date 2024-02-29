package main.java.binarytree.traversal;


import main.java.binarytree.TreeNode;

import java.util.*;

//https://leetcode.cn/problems/binary-tree-postorder-traversal/
public class PostorderTraversal {

    public List<Integer> solution(TreeNode root){
        List<Integer> res = new ArrayList<>();
        traversal(root,res);
        return res;
    }

    public void traversal(TreeNode root, List<Integer> res){
        if(root == null) return;
        traversal(root.left, res);
        traversal(root.right,res);
        res.add(root.val);
    }

    public List<Integer> solution2(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            res.add(node.val);

            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }

        }
        Collections.reverse(res);
        return res;
    }
}
