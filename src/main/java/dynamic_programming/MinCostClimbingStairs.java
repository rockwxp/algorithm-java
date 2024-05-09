package main.java.dynamic_programming;

public class MinCostClimbingStairs {
    /**
     * definition of dp[i]
     * recurrence formula
     * initialise dp array
     * traversal order
     * print dp log
     *
     * */
    public int minCostClimbingStairs(int[] cost){

        int len = cost.length;
        int[] dp = new int[len + 1];

        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i < dp.length ; i++) {

            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }

        return dp[len];
    }
}
