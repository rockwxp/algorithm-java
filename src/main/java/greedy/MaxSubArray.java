package main.java.greedy;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {

        int result = Integer.MIN_VALUE;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
            if (count > result) {
                result = count;
            }
            if (count < 0) {
                count = 0;
            }
        }
        return result;
    }
}
