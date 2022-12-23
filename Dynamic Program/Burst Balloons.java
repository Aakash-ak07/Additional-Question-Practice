// You are given N balloons, indexed from 0 to n - 1. Each balloon is painted with a number on it represented by an array arr. You are asked to brust all the balloons.
// If you brust the ith  balloon,, you will get arr[ i - 1 ] * arr[ i ] * arr[ i + 1] coins. If i - 1, or i + 1 goes out of bounds of the array, consider it as if there is a balloon with a 1 painted on it.
// Return the maximum coins you can collect by brusting the balloons wisely.

// Example 1:
// Input:
// N = 4
// arr[ ] = {3, 1, 5, 8}
// Output: 167
// Explanation: 
// arr[ ] = {3, 1, 5, 8}  - - > {3, 5, 8} - - > {3, 8} - - > { 8} - -> { }
// coins = 3 *1 *5,      +      3*5*8     +   1*3*8   +  1*8*1   = 167
 
// Example 2:
// Input:
// N = 2
// arr[ ] = {1, 10}
// Output: 20
 
// Your Task:
// You don't need to read input or print anything. Your task is to complete the function maxCoins() which takes the array of integers arr and N as parameters and returns the maximum coin you can collect.

// Expected Time Complexity: O(N*N*N)
// Expected Auxiliary Space: O(N*N)


//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      Solution obj = new Solution();
      int ans = obj.maxCoins(n,a);
      System.out.println(ans);
    }
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
  public static int maxCoins(int n, int[] arr) {
    int[] a = new int[n + 2];
    int[][]dp = new int[n + 1][n + 1];
    for(int i = 0; i < dp.length; i++)
    {
        for(int j = 0; j < dp[0].length; j++)
        {
            dp[i][j] = -1;
        }
    }
    a[0] = 1;
    for(int i = 1; i < a.length-1; i++)
    {
        a[i] = arr[i - 1];
    }
    a[a.length - 1] = 1;
    
    return helper(a, 1, arr.length, dp);
  }
  
  public static int helper(int[] arr, int i, int j, int[][]dp)
  {
    if(i > j)
        return 0;
        
    int maximum = Integer.MIN_VALUE;
    if(dp[i][j] != -1)
        return dp[i][j];
    
    for(int idx = i; idx <= j; idx++)
    {
        int cost = arr[idx] * arr[i - 1] * arr[j + 1] + helper(arr, i, idx - 1, dp) + helper(arr, idx + 1, j, dp);
        maximum = Math.max(maximum, cost);
    }
    return dp[i][j] = maximum;
  }
}




     
