package main.java.dualpointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.cn/problems/3sum/
public class ThreeSum {

    public List<List<Integer>> solution(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > 0) {
                break;
            }

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int first =i;
            int left = i+1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[first] +nums[left] + nums[right];
                if (sum == 0) {
                    list.add(Arrays.asList(nums[first],nums[left],nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) {
                        left ++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right --;
                    }
                    left++;
                    right--;
                } else if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left ++;
                }
            }

        }
        return list;
    }
}
