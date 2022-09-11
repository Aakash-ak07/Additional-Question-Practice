import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for (int i = 1; i < n-1; i++) 
        {
            for (int j = 1; j < m-1; j++) 
            {
                if(arr[i-1][j] == 1 && arr[i + 1][j] == 1 && arr[i][j - 1] == 1 && arr[i][j + 1] == 1)
                count++;
            }
        }
        System.out.print(count);
    }
}


// Given a boolean Matrix of size N*M, A cell of the matrix is called "Good" if it is completely surrounded by the cells containing '1' i.e. each adjacent cell (which shares a common edge) contains '1'. 
// Your task is to find the number of such cells.
  
// Sample Input:-
// 3 3
// 1 1 0
// 1 1 1
// 1 1 1

// Sample Output:-
// 1

// Explanation:-
// Only cell at position 1, 1 is good
