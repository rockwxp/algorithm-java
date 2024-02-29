package main.java.binarytree.traversal;

import main.java.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//https://leetcode.cn/problems/binary-tree-preorder-traversal/
public class PreorderTraversal {

    public List<Integer> solution(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traversal(root,res);
        return res;
    }

    public void traversal(TreeNode root, List<Integer> res){
        if (root == null) {
            return;
        }

        res.add(root.val);
        traversal(root.left, res);
        traversal(root.right, res);

    }

    //不通过递归的方法
    public List<Integer> solution2(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null) return res;

        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode tNode = stack.pop();
            res.add(tNode.val);
            if(tNode.right!=null) stack.push(tNode.right);
            if(tNode.left!=null) stack.push(tNode.left);
        }


        return res;
    }

}
