package main.java.stackqueue;

import java.util.ArrayDeque;
import java.util.Deque;
//https://leetcode.cn/problems/sliding-window-maximum/
public class MaxSlidingWindow {

    public int[] solution(int[] nums, int k) {

        int length = nums.length;
        int[] res = new int[length - k + 1];
        int idx = 0;
        MyQueue2 queue = new MyQueue2();
        for (int i = 0; i < k; i++) {
            queue.add(nums[i]);
        }

        res[idx++] = queue.peek();

        for (int i = k; i < length; i++) {

            queue.poll(nums[i - k]);

            queue.add(nums[i]);

            res[idx++] = queue.peek();
        }


        return res;

    }


}
class MyQueue2{

    Deque<Integer> deque = new ArrayDeque<>();

    void poll(int val){
        if (!deque.isEmpty() && val == deque.peek()) {
            deque.poll();
        }
    }

    void add(int val) {
        while (!deque.isEmpty() && val > deque.peekLast()) {
            deque.pollLast();
        }
        deque.add(val);
    }

    int peek(){
        return deque.peek();
    }

}