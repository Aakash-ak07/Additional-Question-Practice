// Given an array of size 2*N in the form as [x1, x2.. xn, y1, y2,. yn], your task is to shuffle the array in the form given as [x1, y1, x2, y2,. xN, yN]
// Input
// First line of input contains a single integer N. Next line of input contains 2*N space separated integers depicting the values of the array.

// Constraints:-
// 1 <= N <= 10000
// 1 <= Arr[i] <= 100000
// Output
// Print the shuffled array.
// Example
// Sample Input:-
// 3
// 1 2 3 4 5 6

// Sample Output:-
// 1 4 2 5 3 6

// Sample Input:-
// 2
// 2 4 6 8

// Sample Output:-
// 2 6 4 8


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void shuffle(int[] arr, int n) {
        for (int i = 0, q = 1, k = n; i < n; i++, k++, q++)
        for (int j = k; j > i + q; j--) {
            // swap a[j-1], a[j]
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[2*n];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        shuffle(arr, n);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }

}
