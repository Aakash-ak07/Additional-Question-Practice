// Given a matrix of size N*N, your task is to find the sum of the primary and secondary diagonal of the matrix.

// For Matrix:-
// M00 M01 M02
// M10 M11 M12
// M20 M21 M22

// Primary diagonal:- M00 M11 M22
// Secondary diagonal:- M02 M11 M20

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void diagonalSum(int arr[][], int n)
    {
        int firstDiag = 0, secDiag = 0;
        for(int i = 0; i < n; i++)
        {
			for(int j = 0; j < n; j++)
            {
               if(i == j)
                    firstDiag += arr[i][j];  
                if(i + j == n -1)
                    secDiag += arr[i][j];    
            }
        }
        System.out.println(firstDiag + " " +secDiag);
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		for(int i = 0; i < n; i++)
        {
			for(int j = 0; j < n; j++)
            {
				arr[i][j] = sc.nextInt();
			}
		}
        diagonalSum(arr, n);
    }
}

// Sample Input:-
// 2
// 1 4
// 2 6

// Sample Output:-
// 7 6

// Sample Input:-
// 3
// 1 4 2
// 1 5 7
// 3 8 1

// Sample Output:-
// 7 10
