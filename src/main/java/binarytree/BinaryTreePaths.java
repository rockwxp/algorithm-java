package main.java.binarytree;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.cn/problems/binary-tree-paths/
public class BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root){
        ArrayList<String> res = new ArrayList<>();
        ArrayList<Integer> paths = new ArrayList<>();
        if (root == null) {
            return res;
        }

        traversal(root,paths,res);

        return res;
    }

    public void traversal(TreeNode curr,List<Integer> paths,List<String> res){
        paths.add(curr.val);

        if (curr.left == null && curr.right == null) {
            StringBuilder path = new StringBuilder();
            for (int i = 0; i < paths.size()-1; i++) {
                path.append(paths.get(i)).append("->");
            }
            path.append(paths.get(paths.size()-1));
            res.add(path.toString());
        }

        if (curr.left != null) {
            traversal(curr.left,paths,res);
            paths.remove(paths.size() - 1);
        }
        if (curr.right != null) {
            traversal(curr.right, paths, res);
            paths.remove(paths.size() - 1);
        }
    }
}
