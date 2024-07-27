package main.LEETCODE.EASY.N746;

/**
 * 746. Min Cost Climbing Stairs,
 * https://leetcode.com/problems/min-cost-climbing-stairs/description/, DP
 *
 * @author hazel
 */
public class Solution {

    //dp로 풀이
    //dp[3] = dp[1], dp[2] 최소값과 arr[3]을 더함.
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i <= n; i++) {
            int current = i == n ? 0 : cost[i];
            dp[i] = current + Math.min(dp[i - 1], dp[i - 2]);
        }

        return dp[n];
    }
}
