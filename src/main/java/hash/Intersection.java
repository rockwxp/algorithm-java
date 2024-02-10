package main.java.hash;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.cn/problems/intersection-of-two-arrays/
public class Intersection {

    public int[] solution2(int[] nums1, int[] nums2) {

        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }

        Set<Integer> resultSet = new HashSet<>();

        int[] arr1 = new int[1000];
        for (int i = 0; i < nums1.length; i++) {
            arr1[nums1[i]] = 1;
        }

        for (int i = 0; i < nums2.length; i++) {
            if (arr1[nums2[i]] == 1) {
                resultSet.add(nums2[i]);
            }
        }

        int[] resultArray = new int[resultSet.size()];

        int i = 0;
        for (int j : resultSet) {
            resultArray[i] = j;
            i++;
        }

        return resultArray;

    }

    public int[] solution1(int[] nums1, int[] nums2){

        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])) {
                resultSet.add(nums2[i]);
            }
        }

        return resultSet.stream().mapToInt(x->x).toArray();

    }
}
