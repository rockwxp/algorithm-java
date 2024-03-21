package main.java.binarytree;

import java.util.ArrayList;
import java.util.List;

public class FindMode {

    private TreeNode preNode;
    private int count = 0;
    private int maxCount = 0;
    private List<Integer> result = new ArrayList<>();
    public int[] findMode(TreeNode root){
        traversal(root);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public void traversal(TreeNode root) {
        if (root == null) {
            return;
        }
        traversal(root.left);

        if (preNode != null) {
            if (root.val == preNode.val) {
                count++;
            } else {
                count = 1;
            }
        }else {
            count = 1;
        }
        preNode = root;

        if (maxCount < count) {
            result.clear();
            result.add(root.val);
            maxCount = count;
        } else if (maxCount == count) {
            result.add(root.val);
        }

        traversal(root.right);
    }
}
