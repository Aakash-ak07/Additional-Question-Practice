// Given an array Arr of N integers, your task is to print the sum of elements present at even places and print the product of elements present at the odd places.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum = 0; 
        long product = 1;
        for(int i = 0; i < n; i++)
        {
            if((i+1) % 2 == 0)
            {
                sum +=arr[i];
            }
            else 
            {
                product *= arr[i];
            }
        }
        System.out.print(sum + " " + product);
    }
}

// Sample Input:-
// 5
// 1 2 3 4 5

// Sample Output:-
// 6 15

// Explanation:-
// Sum = 2 + 4
// Product = 1*3*5
