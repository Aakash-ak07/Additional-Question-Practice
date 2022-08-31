//Given an N*N matrix. Print the elements of the matrix in anticlockwise order

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void antiClockWise(int arr[][], int m, int n)
    {
        int i, k = 0, x = 0;
        int count = 0;
        int total = m * n;

        while(k < m && x < n)
        {
            if(count == total) break;
            for (i = k; i < m; ++i)
            {
                System.out.print(arr[i][x] + " ");
                count++;
            }
            x++;
            if (count == total) break;
            for (i = x; i < n; ++i)
            {
                System.out.print(arr[m - 1][i] + " ");
                count++;
            }
            m--;
            if(count == total) break;

            if (k < m)
            {
                for (i = m - 1; i >= k; --i)
                {
                    System.out.print(arr[i][n - 1] + " ");
                    count++;
                }
                n--;
            }
            if(count == total) break;
            if (x < n)
            {
                for (i = n - 1; i >= x; --i)
                {
                    System.out.print(arr[k][i] + " ");
                    count++;
                }
                k++;
            }
        }
    }

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
            }
        }
        antiClockWise(arr, n , n);
    }
}



// Sample Input
// 4
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16

// Sample output
// 1 5 9 13 14 15 16 12 8 4 3 2 6 10 11 7
