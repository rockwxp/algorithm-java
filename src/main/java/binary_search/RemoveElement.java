package main.java.binary_search;

public class RemoveElement {

    //暴力解法
    public int solution1(int[] nums,int val){
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            if (nums[i] == val) {
                for (int j = i + 1; j < len; j++) {
                    nums[j-1] = j;
                }
                len--;//将后面的数据前移一位
                i--;//由于num[i] = val, 所以nums[i] 替换到下一位的 value， 下一次的循环会发生 i++，需要通过 i--来要比较这个下一位的 value 是否等于 val
            }
        }

        return len;

    }
    //快慢双指针
    public int solusion2(int nums[],int val){

        int slow = 0;

        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }

        return slow;
    }

    //相向双指针
    public int solution3(int nums[],int val){
        int left = 0;
        int right = nums.length-1;
        while (left <= right) {

            while (left <= right && nums[left] != val) {
                left++;
            }//找到左边等于val的下标

            while (left <= right && nums[right] == val){
                right--;
            }//找到右边不等于 val 的下标
            if(left < right){
                nums[left] = nums[right];//左边等于 val 的元素被右边不等于 val的替换
                left++;//接着检查下一个元素是否等于 val
                right--;//接着拿下一个替换的元素
            }
        }

        return left;
    }


    public static void main(String[] args) {
        int nums[] = new int[]{3, 2, 2, 3};
        int val = 3;
        RemoveElement re = new RemoveElement();
        int result = re.solusion2(nums, val);
        System.out.println(result);
    }
}
