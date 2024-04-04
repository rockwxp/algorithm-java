package main.java.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum {

    LinkedList<Integer> path = new LinkedList();
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates,int target){
        if (candidates == null || candidates.length == 0) {
            return result;
        }

        backtracking(candidates,target,0,0);

        return result;
    }

    public void backtracking(int[] candidates,int target,int sum,int startIndex){
        if(sum > target) return;
        if (sum == target) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = startIndex; i < candidates.length; i++) {
            path.add(candidates[i]);
            sum+=candidates[i];
            backtracking(candidates, target, sum,i );
            sum-=candidates[i];
            path.removeLast();
        }
    }



}
