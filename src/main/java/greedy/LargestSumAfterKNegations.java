package main.java.greedy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LargestSumAfterKNegations {

    public int largestSumAfterKNegations(int[] nums,int k){

       Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (k > 0 && nums[i] < 0) {
                nums[i] *=-1;
                k--;
            }
        }
        if (k % 2 == 1) {
            Arrays.sort(nums);
            nums[0] *=-1;
        }

        return getSum(nums);

    }

    public int getSum(int[] nums){
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result+= nums[i];
        }
        return result;
    }
}
