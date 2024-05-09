package main.java.dynamic_programming;

public class FibonacciNumber {
/**
 * definition of dp[i]
 * recurrence formula
 * initialise dp array
 * traversal order
 * print dp log
 *
 * */
    public int fib(int n){

        if (n<=1) return n;

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}
