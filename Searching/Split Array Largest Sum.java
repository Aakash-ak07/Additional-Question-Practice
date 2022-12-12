// Given an array arr[] of N elements and a number K. Split the given array into K subarrays such that the maximum subarray sum achievable out of K subarrays formed is minimum possible. Find that possible subarray sum.

// Example 1:
// Input:
// N = 4, K = 3
// arr[] = {1, 2, 3, 4}
// Output: 4
// Explanation:
// Optimal Split is {1, 2}, {3}, {4}.
// Maximum sum of all subarrays is 4,
// which is minimum possible for 3 splits. 

// Example 2:
// Input:
// N = 3, K = 2
// A[] = {1, 1, 2}
// Output:
// 2
// Explanation:
// Splitting the array as {1,1} and {2} is optimal.
// This results in a maximum sum subarray of 2.

// Your Task:
// The task is to complete the function splitArray() which returns the maximum sum subarray after splitting the array into K subarrays such that maximum sum subarray is minimum possible.

// Constraints:
// 1 ≤ N ≤ 105
// 1 ≤ K ≤ N
// 1 ≤ arr[i] ≤ 104

class Solution {
    static int splitArray(int[] arr , int N, int K) {
        int sum = 0;
        for(int i = 0; i < N; i++)
        {
            sum += arr[i];
        }
        int start = 0, end = sum;
        int res = 0;
        while(start <= end)
        {
            int mid = start + (end - start)/2;
            if(helper(arr, N, K, mid))
            {
                res = mid;
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return res;
    }
    
    static boolean helper(int[] arr, int n, int k, int mid)
    {
        int count = 1;
        int temp = 0;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] + temp <= mid)
                temp += arr[i];
            else
            {
                count++;
                if(count > k || arr[i] > mid)
                    return false;
                temp = arr[i];
            }
        }
        return true;
    }
}
