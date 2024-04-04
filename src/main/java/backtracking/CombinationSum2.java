package main.java.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum2 {

    LinkedList<Integer> path = new LinkedList<>();
    List<List<Integer>> result = new ArrayList<>();

    int sum = 0;
    boolean[] used;

    public List<List<Integer>> combinationSum2(int[] candidates,int target){

        used = new boolean[candidates.length];
        Arrays.fill(used, false);
        Arrays.sort(candidates);
        backtracking(candidates, target, 0);
        return result;
    }

    public void backtracking(int[] candidates,int target,int startIndex){

        if (sum > target) {
            return;
        }
        if (sum == target) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = startIndex; i < candidates.length; i++) {

            if (i > 0 && candidates[i] == candidates[i - 1] && used[i - 1] == false) {
                continue;
            }
            path.add(candidates[i]);
            sum+=candidates[i];
            used[i]=true;
            backtracking(candidates, target, i + 1);
            sum -= candidates[i];
            path.removeLast();
            used[i] = false;
        }
    }
}
