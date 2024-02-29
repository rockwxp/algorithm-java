package main.java.stackqueue;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//https://leetcode.cn/problems/top-k-frequent-elements/
public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        PriorityQueue<int[]> queue = new PriorityQueue<>((n1, n2) -> n1[1] - n2[1]);
        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int num : nums) {
            maps.put(num, maps.getOrDefault(num, 0) + 1);
        }

        for (var val : maps.entrySet()) {
            queue.add(new int[]{val.getKey(), val.getValue()});

            if (queue.size() > k) {
                queue.poll();
            }
        }

        for (int i = 0; i < k; i++) {
            res[i] = queue.poll()[0];
        }

        return res;
    }
}
