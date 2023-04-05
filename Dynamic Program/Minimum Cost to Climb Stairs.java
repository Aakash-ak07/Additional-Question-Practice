// You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps. You can either start from the step with index 0, or the step with index 1.
// Return the minimum cost to reach the top of the floor.
// Input
// User Task:
// Since this will be a functional problem, you don't have to take input. You just have to complete the function minCostClimbingStairs() that takes the array cost as a parameter.

// Constarints
// 2 ≤ cost.length ≤ 1000
// 0 ≤ cost[i] ≤ 999
// Output
// Return the minimum cost to reach the top of the floor.
// Example
// Sample Input:
// 3
// 10 15 20

// Sample output:
// 15

// Explanation
// You will start at index 1.
// - Pay 15 and climb two steps to reach the top.
// The total cost is 15.


class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i = 2; i < n; i++)
        {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }
        return Math.min(dp[n - 1], dp[n - 2]);
    }
}
