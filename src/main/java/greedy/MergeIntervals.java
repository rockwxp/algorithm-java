package main.java.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class MergeIntervals {
    public int[][] merge(int[][] intervals){
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        LinkedList<int[]> res = new LinkedList<>();
        res.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            if (res.getLast()[1] >= intervals[i][0]) {
                int start = res.getLast()[0];
                int end = Math.max(res.getLast()[1],intervals[i][1]);
                res.removeLast();
                res.add(new int[]{start,end});
            }else {
                res.add(intervals[i]);
            }
        }
        return res.toArray(new int[res.size()][]);

    }
}
