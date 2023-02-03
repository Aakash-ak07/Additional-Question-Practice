// Given an array Arr of size N containing positive integers. 
// Find the maximum sum of a subsequence such that no two numbers in the sequence should be adjacent in the array.

// Example 1:
// Input:
// N = 6
// Arr[] = {5, 5, 10, 100, 10, 5}
// Output: 110
// Explanation: If you take indices 0, 3
// and 5, then Arr[0]+Arr[3]+Arr[5] =
// 5+100+5 = 110.
 

// Example 2:
// Input:
// N = 4
// Arr[] = {3, 2, 7, 10}
// Output: 13
// Explanation: 3 and 10 forms a non
// continuous  subsequence with maximum
// sum.

class Solution {
    int findMaxSum(int arr[], int n) {
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = arr[0];
        for(int i = 2; i < n + 1; i++)
        {
            dp[i] = Math.max(dp[i - 2] + arr[i - 1], dp[i - 1]);
        }
        return dp[n];
    }
}
