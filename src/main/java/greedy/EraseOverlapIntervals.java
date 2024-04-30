package main.java.greedy;

import java.util.Arrays;

public class EraseOverlapIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a,b) -> {
            return a[1] - b[1];
        });

        int count = 0;

        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] < intervals[i-1][1]){
                count++;
                intervals[i][1] = Math.min(intervals[i][1],intervals[i-1][1]);
            }
        }
        return count;
    }
}
