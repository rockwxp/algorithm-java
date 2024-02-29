package main.java.binarytree;

import java.util.*;

public class LevelOrder {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {

            int size = queue.size();
            List<Integer> item  = new ArrayList<>();
            while (size > 0) {

                TreeNode node = queue.poll();
                item.add(node.val);
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
                size--;
            }
            res.add(item);
        }
        return res;

    }

}
