package main.java.dualpointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.cn/problems/4sum/description/
public class FourSum {

    public List<List<Integer>> solution(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {

            int first = i;

            if (nums[first] > 0 && nums[first] > target) {
                break;
            }


            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }

            for (int j = i+1; j < nums.length; j++) {

                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int left = j+1;
                int right = nums.length-1;
                    while (left < right) {
                        int sum = nums[first] + nums[j] + nums[left] + nums[right];
                        if (sum == target) {
                            result.add(Arrays.asList(nums[first], nums[j], nums[left], nums[right]));
                            while (left < right && nums[left]==nums[left+1]) left++;
                            while (left < right && nums[right]==nums[right-1]) right--;
                            left ++;
                            right --;

                        } else if (sum < target) {
                            left++;
                        } else if (sum > target) {
                            right--;
                        }
                }
            }
        }
        return result;
    }
}
