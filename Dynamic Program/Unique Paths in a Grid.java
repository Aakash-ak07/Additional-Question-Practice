// You are given a matrix grid of n x  m size consisting of values 0 and 1. A value of 1 means that you can enter that cell and 0 implies that entry to that cell is not allowed.
// You start at the upper-left corner of the grid (1, 1) and you have to reach the bottom-right corner (n, m) such that you can only move in the right or down direction from every cell.
// Your task is to calculate the total number of ways of reaching the target modulo (109+7).
// Note: The first (1, 1) and last cell (n, m) of the grid can also be 0

// Example 1:
// Input:
// n = 3, m = 3
// grid[][] = {{1, 1, 1};
//             {1, 0, 1};
//             {1, 1, 1}}
// Output:
// 2
// Explanation:
// 1 1 1
// 1 0 1
// 1 1 1
// This is one possible path.
// 1 1 1
// 1 0 1
// 1 1 1
// This is another possible path.

// Example 2:
// Input:
// n = 1, m = 3
// grid = {{1, 0, 1}}
// Output :
// 0
// Explanation:
// There is no possible path to reach the end


class Solution {
    static int uniquePaths(int n, int m, int[][] grid) {
        int mod = ((int) Math.pow(10, 9)) + 7;
        if(grid[0][0] == 0)
            return 0;
        long[][] dp = new long[n][m];
        dp[0][0] = 1;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(i == 0 && j == 0 || grid[i][j] == 0)
                    continue;
                    if(i == 0)
                        dp[i][j] = dp[i][j - 1];
                    else if(j == 0)
                        dp[i][j] = dp[i - 1][j];
                    else 
                        dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % mod;
            }
        }
        return (int)(dp[n - 1] [m - 1]);
    }
};
