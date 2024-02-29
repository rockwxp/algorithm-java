package main.java.binarytree;

import main.java.binarytree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class NextRightPointers {

    public TreeNode connect(TreeNode root) {
        if(root==null) return root;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            while (size > 0){

                TreeNode curr = queue.poll();

                if (size - 1 != 0) {
                    curr.next = queue.peek();
                }

                if(curr.left!=null){
                    queue.add(curr.left);
                }

                if (curr.right != null) {
                    queue.add(curr.right);
                }
                size--;
            }
        }


        return root;

    }
}
