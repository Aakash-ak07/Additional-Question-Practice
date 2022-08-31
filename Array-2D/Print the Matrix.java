// Given a matrix of N*N dimensions. Take the input and display the matrix as an output.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int m = sc.nextInt();
        int [][] arr = new int[n][n];

        for(int i = 0; i<n; i++)
        {
            for (int j = 0; j<n; j++)
            {
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}


// Input:
// 2
// 3 4
// 7 6

// Output:
// 3 4
// 7 6
