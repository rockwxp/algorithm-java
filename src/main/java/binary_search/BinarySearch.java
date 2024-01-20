package main.java.binary_search;

public class BinarySearch {
    //[3,5,6,8,9,10]
    //[0,1,2,3,4,5]
    //target = 6

    public static void main(String[] args) {

        int[] nums = new int[]{3,5,6,8,9,10};
        int target = 5;

        System.out.println(solution2(nums, target));
    }

    public static int solution1(int[] nums,int target){

        int left = 0;
        int right = nums.length;                   //6,

        while (left < right) {                     // 0 < 6, 0 < 3, 2 < 3
            int middle = (left + right)/2;         // (0+6)/2=3,(0+3)/2=1, (2+3)/2=2
            if (nums[middle] > target) {           // 8 > 6 ,skip ,skip
                right = middle;                   //right =3,skip ,skip
            } else if (nums[middle] < target) {   //5 < 6 ,skip
                left = middle + 1;                // left 1+1=2,skip
            }else {                               //6==6
                return middle;
            }
        }
        return -1;
    }

    public static int solution2(int[] nums,int target){
        if (nums[0] > target || nums[nums.length - 1] < target) {
            return -1;
        }

        int left = 0;
        int right = nums.length-1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                right = middle - 1;
            } else if (nums[middle] < target) {
                left = middle + 1;
            }
        }
        return -1;
    }

}
