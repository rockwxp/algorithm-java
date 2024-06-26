package main.java.greedy;

public class CanJump {
    public boolean canJump(int[] nums){
        if(nums.length==1) return true;

        int cover = 0;
        for (int i = 0; i <= cover; i++) {
            cover = Math.max(i + nums[i], cover);
            if (cover >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}
