//There are N buildings in a row with different heights H[i] (1 <= i <= N).
// You are viewing the buildings from the left and you can see the roof of a building i if no building to the left of the ith building has a height greater than the ith building.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int count = 1;
        int max = arr[0];
        for(int i = 0; i < n; i++)
        {
            if(max < arr[i])
            {
                count++;
                max = arr[i];
            }
        }
        System.out.print(count);
    }
}


// Sample input:
// 5
// 1 2 2 4 3

// Sample output:
// 3

//Explanation:- the building at index 3 will hide before building at index 2 and building at index 5 will hide before building at index 4
