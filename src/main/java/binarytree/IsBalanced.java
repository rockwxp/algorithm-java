package main.java.binarytree;
//https://leetcode.cn/problems/balanced-binary-tree/
public class IsBalanced {
    public boolean isBalanced(TreeNode root){
        int hight = getHight(root);
        return hight != -1;
    }


    public int getHight(TreeNode root){
        if(root == null) return 0;

        int leftHight = getHight(root.left);
        if(leftHight==-1) return -1;
        int rightHight = getHight(root.right);
        if(rightHight == -1) return -1;

        int res ;
        if (Math.abs(leftHight - rightHight) > 1) {
            res = -1;
        } else {
            res = 1 + Math.max(leftHight, rightHight);
        }
        return res;
    }
}
