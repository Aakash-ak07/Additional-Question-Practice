// Given an array arr of n integers where every number occurs exactly twice except for one number, that occurs exactly once. Every pair of equal integers occurs adjacent.

// Find the single element in O(logn) time.
// Input
// First line contains n, denoting the size of array.
// Second line contains n space separated integers.

// Constraints :
// 1 <= n <= 10^5
// 0 <= arr[i] <= 10^9
// n is odd
// Output
// Print the required single element.
// Example
// Input:
// 5
// 2 2 4 1 1

// Output:
// 4

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print(singleElement(arr, n));
    }
    
    /* using binary search*/
    public static int singleElement (int[] arr, int n)
    {
        int l = 0, r = n - 2;
        while(l <= r)
        {
            int mid = (l+r)/2;
            if(arr[mid] == arr[mid ^ 1])
                l = mid+1;
            else
                r = mid-1;
        }
        return arr[l];
    }
}
