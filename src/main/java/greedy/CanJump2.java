package main.java.greedy;

public class CanJump2 {

    public int jump(int[] nums){
        if (nums == null || nums.length == 1) {
            return 0;
        }
        int currDistance = 0;
        int maxDistance = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            maxDistance = Math.max(maxDistance, nums[i] + i);
            if (maxDistance >= nums.length - 1) {
                count++;
                break;
            }
            if (i == currDistance) {
                count++;
                currDistance = maxDistance;
            }
        }
        return count;
    }
}
