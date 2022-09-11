// A left rotation operation on an array of size n shifts each of the array's elements 1 unit to the left. Given an integer, d, rotate the array that many steps left and return the result.
// Example
// d = 2
// arr = [1, 2, 3, 4, 5]
// arr' = [3, 4, 5, 1, 2]

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void rotate(int arr[], int n, int d){
	    int p = 1;
	    while (p <= d) 
	    {
	        int last = arr[0];
	        for (int i = 0; i < n - 1; i++) 
	        {
	            arr[i] = arr[i + 1];
	        }
	        arr[n - 1] = last;
	        p++;
	    }
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
		rotate(arr, n, d);
		for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}

