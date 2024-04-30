package main.java.greedy;

public class WiggleSubsequence {

    public int wiggleMaxLength(int[] nums){
        if (nums.length==1) return 1;
        int preWiggle = 0;
        int curWiggle = 0;
        int result = 1;

        for (int i = 0; i < nums.length-1; i++) {
            curWiggle = nums[i+1] - nums[i];
            if ((preWiggle >= 0 && curWiggle < 0) || (preWiggle <= 0 && curWiggle > 0)) {
                result++;
                preWiggle = curWiggle;
            }
        }
        return result;
    }
}
