// There is circular river with circumference K. There are N cities on the banks of the river. The position p(i) of the i-th city is defined as its distance from the topmost point of the river in the clockwise manner.
// You are given the positions of all the N cities, your task is to find the minimum distance you need to travel to visit all the N cities. You can start at whichever point you like, and can move both clockwise and anticlockwise around the river.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[k];
        for(int i = 0; i < k; i++)
        {
            arr[i] = sc.nextInt();
        }
        int diff = 0;
        for(int i = 1; i < k; i++)
        {
            if(diff < arr[i] - arr[i-1]) diff = arr[i] - arr[i-1];
        }
        if(diff < arr[0] + n -arr[k - 1]) diff = arr[0] + n - arr[k-1];  
        System.out.println(n - diff);
    }
}


// Sample Input
// 20 3
// 0 5 15

// Sample Output
// 10

// Explanation: We start at 3rd city, then visit 1st city, then visit 2nd city. Total distance covered = 5 + 5 = 10.

// Sample Input
// 20 3
// 5 10 15

// Sample Output
10
