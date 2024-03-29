package main.java.binarytree;

public class SortedArrayToBST {

    public TreeNode sortedArrayToBST(int[] nums) {

       return traversal(nums, 0, nums.length - 1);


    }

    private TreeNode traversal(int[] nums, int left, int right) {
        if(left > right) return null;

        int midIndex = (left + right) / 2;
        TreeNode root = new TreeNode(nums[midIndex]);

        root.left = traversal(nums, left, midIndex - 1);
        root.right = traversal(nums, midIndex + 1, right);

        return root;
    }
}
