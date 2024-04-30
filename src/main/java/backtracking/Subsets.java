package main.java.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Subsets {

    LinkedList<Integer> path = new LinkedList<>();
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums){
        backtracking(nums, 0);
        return result;
    }

    public void backtracking(int[] nums,int startIndex){
        result.add(new ArrayList<>(path));
        ;
        for (int i = startIndex; i < nums.length; i++) {
            path.add(nums[i]);
            backtracking(nums,i+1);
            print(path,i);
            path.removeLast();

        }
    }

    public void print(List<Integer> nums,int index){

        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));

        }
        System.out.println("index="+index+":============");
    }
}
