package main.java.binary_search;

public class SquareSortedArray {
    public int[] solution1(int[] nums){

        int[] result = new int[nums.length];
        int index = result.length-1;
        int left = 0;
        int right = nums.length-1;


        while (left <= right) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                result[index] = nums[left] * nums[left];
                left++;
                index--;
            } else {
                result[index] = nums[right] * nums[right];
                right--;
                index--;
            }
        }

        return result;
    }


}
