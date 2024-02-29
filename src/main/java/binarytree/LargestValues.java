package main.java.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//https://leetcode.cn/problems/find-largest-value-in-each-tree-row/
public class LargestValues {

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            int maxNum = Integer.MIN_VALUE;
            while (size > 0){
                TreeNode node = queue.poll();
                maxNum = Math.max(maxNum,node.val);


                if(node.left!=null)queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
                size--;
            }
            res.add(maxNum);

        }
        return res;
    }

}
