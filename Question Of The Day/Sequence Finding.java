// You have an empty sequence A. Along with that you are given an array B of size N. You create a new integer i = 0 and perform N operations on the sequence A in the following way:
// Check if i == N + 1, break.
// Append Bi to the end of A and increment i by 1.
// Reverse the sequence A.
// Find the sequence A after all the operations.


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        if(n % 2 == 0)
        {
            for(int i = n-1; i >= 0; i -= 2)
            {
                System.out.print(arr[i] + " ");
            }
            for(int i = 0; i < n; i += 2)
            {
                System.out.print(arr[i] + " ");
            }
        }
        else
        {
            for(int i = n-1; i >= 0; i -= 2)
            {
                System.out.print(arr[i] + " ");
            }
            for(int i = 1; i < n-1; i += 2)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
}


// Sample Input:
// 4
// 1 2 3 4

// Sample Output:
// 4 2 1 3
