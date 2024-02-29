package main.java.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        int depth = 0;
        if (root == null) {
            return depth;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            while (size > 0) {
                TreeNode node = queue.poll();
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
                size--;
            }
            depth++;
        }


        return depth;
    }

    public int getHight(TreeNode root){
        if(root == null) return 0;

        int left = getHight(root.left);
        int right = getHight(root.right);
        int hight = Math.max(left, right) + 1;
        return hight;
    }
}
