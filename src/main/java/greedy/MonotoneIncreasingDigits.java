package main.java.greedy;

public class MonotoneIncreasingDigits {

    public int monotoneIncreasingDigits(int n){

        char[] nums = String.valueOf(n).toCharArray();
        int flag = nums.length;

        for (int i = nums.length-1; i > 0; i--) {
            if (nums[i] < nums[i - 1]) {
                nums[i - 1]--;
                flag = i;
            }
        }

        for (int i = flag; i < nums.length; i++) {
            nums[i] = '9';
        }

        return Integer.parseInt(String.valueOf(nums));
    }
}
