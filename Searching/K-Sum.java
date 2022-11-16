// Given an array arr[] of size N and a number K, the task is to find the smallest number M such that the sum of the array becomes lesser than or equal to the number K when every element of that array is divided by the number M.

// Note: Each result of the division is rounded to the nearest integer greater than or equal to that element. For example: 10/3 = 4 and 6/2 = 3
// Input
// The first line contains two integers N and K.
// Next line contains N integers denoting the elements of arr[]

// Constraints:
// 1 <= N <= 100000
// 1 <= arr[i] <= 100000
// 1 <= K <= 100000000
// Output
// Print a single integer the value of smallest number M
// Example
// Sample Input:
// 4 6
// 2 3 4 9

// Sample Output:
// 4

// Explanation:
// When every element is divided by 4 - 2/4 + 3/4 + 4/4 + 9/4 = 1 + 1 + 1 + 3 = 6
// When every element is divided by 3 - 2/3 + 3/3 + 4/3 + 9/3 = 1 + 1 + 2 + 3 = 7 which is greater than K.
// Hence the smallest integer which makes the sum less than or equal to K = 6 is 4.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int kSum(int arr[], int n, int limit)
    {
        int low = 0, high = 1000000000;
        while(low < high)
        { 
            int mid = (low + high)/2;
            int sum = 0;
            for(int i = 0; i < n; i++)
            {
                sum += Math.ceil((double)arr[i]/ (double) mid);
            }
            if(sum <= limit)
                high =mid;
            
            else
                low = mid + 1;
        }
        return low;
    }
    public static void main (String[] args) {   
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print(kSum(arr,n,m));
        System.out.println("");
    }
}
