// Given an array A[ ] of size N containing positive integers, find maximum and minimum elements from the array.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int getMax(int[] arr, int n)
    {
        int Max = arr[0];
        for(int i = 0; i < n; i++)
        {
            Max = Math.max(Max,arr[i]);
        }
        return Max; 
    }
    public static int getMin (int[] arr, int n)
    {
    int Min = arr[0];
        for(int i = 0; i < n; i++)
        {
            Min = Math.min(Min,arr[i]);
        }
        return Min;
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 0; k < t; k++)
        {
            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
            }
            System.out.print(getMax(arr, n)+" ");
            System.out.print(getMin(arr, n));
            System.out.println();
        }
    }
}

// Sample Input:
// 2
// 5
// 7 3 4 5 6
// 4
// 1 2 3 4

// Sample Output:
// 7 3
// 4 1

-----------------
//2nd solution
-----------------
    
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
                if(arr[i] < min)
                {
                    min = arr[i];
                }
                if(arr[i] > max)
                    max = arr[i];
            }
            // Arrays.sort(arr);
            System.out.print(max + " " + min);
            System.out.println("");
        }
    }
}
