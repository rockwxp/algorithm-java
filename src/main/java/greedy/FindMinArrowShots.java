package main.java.greedy;

import java.util.Arrays;

public class FindMinArrowShots {
    public int findMinArrowShots(int[][] points){

        Arrays.sort(points, (a,b) -> Integer.compare(a[0],b[0]));

        int result = 1;
        for (int i = 1; i < points.length; i++) {

            if (points[i][0] > points[i - 1][1]) {
                result++;
            } else {
                points[i][1] = Math.min(points[i][1],points[i-1][1]);
            }
        }
        return result;
    }
}
