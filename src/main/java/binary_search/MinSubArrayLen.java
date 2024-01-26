package main.java.binary_search;
//长度最小的子数组
public class MinSubArrayLen {

  //滑动窗口
  public int solution(int target, int[] nums) {
      int result = Integer.MAX_VALUE;
      int subLength = 0;
      int sum = 0;
      int left = 0; //the start of the window
      for (int right = 0; right < nums.length; right++) { //the end of the window
          sum += nums[right];
          while (sum >= target) {
              subLength = right - left + 1;
              result = Math.min(result, subLength); //choose the shortest length
              sum -= nums[left++];//change the start of the window
          }
      }

      return result == Integer.MAX_VALUE ? 0 : result;


  }


}
