package main.java.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum3 {

    LinkedList<Integer> path = new LinkedList<>();
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        traversal(n, k, 0, 1);
        return result;
    }


    public void traversal(int targetSum, int k, int sum, int startIndex) {
        if(sum > targetSum) return;

        if (path.size() == k) {
            if (sum == targetSum) {
                result.add(new ArrayList<>(path));
                return;
            }
        }

        for (int i = startIndex; i <= 9; i++) {
            path.add(i);
            sum+=i;
            traversal(targetSum, k, sum, i + 1);
            sum-=i;
            path.removeLast();
        }
    }



}
