package main.java.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Subsets2 {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    boolean[] used;

    public List<List<Integer>> subsetsWithDup(int[] nums){
        Arrays.sort(nums);
        used = new boolean[nums.length];
        Arrays.fill(used,false);

        return result;
    }

    public void backtracking(int[] nums,int startIndex){
        result.add(new ArrayList<>(path));
        for (int i = startIndex; i < nums.length; i++) {

            if (i > 0 && nums[i] == nums[i - 1] && used[i - 1] == false) {
                continue;
            }

            path.add(nums[i]);
            used[i] = true;
            backtracking(nums, i + 1);
            path.removeLast();
            used[i] = false;
        }


    }



}
