// Given a matrix of size M*N, your task is to find the maximum sum of a column.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int arr[][] = new int[m][n];

		for(int i = 0; i < m; i++)
        {
			for(int j = 0; j < n; j++)
            {
				arr[i][j] = sc.nextInt();
			}
		}

        int maxSumCol = Integer.MIN_VALUE;
        for(int k = 0; k < n; k++)
        {
            int colSum = 0;
            for(int x = 0; x < m; x++)
            {
                colSum += arr[x][k];
            }
            maxSumCol = Math.max(maxSumCol, colSum);
        }
        System.out.println(maxSumCol);
    }
}

// Sample Input:-
// 3 3
// 1 2 3
// 4 5 6
// 7 8 9

// Sample Output:-
// 18

// Explanation:-
// 1 + 4 + 7 = 12
// 2 + 5 + 8 = 15
// 3 + 6 + 9 = 18
// maximum = 18
