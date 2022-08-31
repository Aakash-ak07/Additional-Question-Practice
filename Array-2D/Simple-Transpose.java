// You are given a NxN matrix. You need to find the transpose of the matrix

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int [][] arr = new int [n][n];
         for (int i = 0; i<n ; i++)
         {
            for (int j = 0; j<n; j++)
            {
            arr[i][j] = sc.nextInt();
            System.out.print("");
            }
         }
         System.out.print("");
            for (int i=0; i<n; i++)
            {
                for (int j = 0; j<n; j++)
                {
                    System.out.print("");
                }
            }
            System.out.print("");
            for (int i=0; i<n; i++)
            {
                for (int j = 0; j<n; j++)
                {
                     System.out.print(arr[j][i] + " ");
                }
             System.out.println("");
            }
      System.out.print("");
    }
}
