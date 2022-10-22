// Given an array of n elements, where each element is at most k away from its position in the sorted array, you need to sort the array optimally.
// Note: DO NOT use STL sort() function for this question.

// Input
// The first line contains two elements n and k separated by a space. The second line contains n elements of array.

// Constraints:
// 1 <= n <= 100000
// 1 <= k <= n
// 1 <= arr(i) <= 1000000
// Output
// Print the sorted array.
// Example
// Sample Input:
// 7 3
// 6 5 2 3 8 10 9

// Sample Output:
// 2 3 5 6 8 9 10

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void nearlySort(int[] arr, int n, int k)
    {
        if(arr == null) return;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
    int count = Math.min(n, k + 1);                  // if arr length is less than k+1 element
        
        for(int i = 0; i < count; i++)
        {
            pq.add(arr[i]);
        }
        int idx = 0;
        for(int i = k+1; i < n; i++)
        {
            arr[idx++] = pq.peek();
            pq.remove();
            pq.add(arr[i]);
        }
        Iterator<Integer> itr = pq.iterator();
 
        while (itr.hasNext()) 
        {
            arr[idx++] = pq.peek();
            pq.remove();
        }

        for(int i = 0; i < n; i++)
            System.out.print(arr[i]+ " ");
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        nearlySort(arr, n, k);
    }
}

