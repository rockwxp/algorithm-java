package main.java.dualpointer;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] solution(int[] nums, int target) {

        int[] arr = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int temp = target - nums[i];
            Boolean isExist = map.containsKey(temp);
            if (isExist) {
                arr[0] = i;
                arr[1] = map.get(temp);
                break;
            }
            map.put(nums[i], i);

        }
        return  arr;
    }



}
