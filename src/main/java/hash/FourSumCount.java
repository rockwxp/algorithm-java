package main.java.hash;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.cn/problems/4sum-ii/
public class FourSumCount {

    public int solution(int[] nums1, int[] nums2, int[] nums3, int[] nums4){

        int count = 0;
        Map<Integer, Integer> map1 = new HashMap<>();

        for (int i : nums1) {
            for (int j : nums2) {
                int sum = i+j;
                map1.put(sum,map1.getOrDefault(sum,0)+1);
            }
        }

        for (int i: nums3){
            for (int j : nums4) {
                int target = 0-(i+j);
                if (map1.containsKey(target)) {
                    count += map1.get(target);
                }
            }
        }

        return count;
    }
}
