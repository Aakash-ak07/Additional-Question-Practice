// Given a circularly sorted integer array, find the total number of times the array is rotated. Assume there are no duplicates in the array, and the rotation is in the anti- clockwise direction.
// Input
// First line of input contains a single integer N, next line contains N space separated integers depicting the values of array.

// Constraints:-
// 1 < = N < = 20000
// -10^4 < = Arr[i] < = 10^4
// Output
// Print the number of rotations in a circularly sorted array
// Example
// Sample Input:-
// 6
// 8 9 10 2 5 6

// Sample Output:-
// 3


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int findRotation (int[] arr)
    {
        int left = 0, right = arr.length-1;
        // whenever left cross the right 
        while(left <= right)
        {
            if(arr[left] <= arr[right])  //if arr[right] is grater then left then return left
                return left;
        
            int mid = (left + right) / 2;

            // find the next and previous element of the mid element
            // (in a circular manner)
            int next = (mid + 1) % arr.length;
            int prev = (mid - 1 + arr.length) % arr.length;

            // if the `mid` element is less than both its next and previous
                // neighbor, it is the array's minimum element
            if(arr[mid] <= arr[next] && arr[mid] <= arr[prev])
                return mid;

            else if (arr[mid] >= arr[left])     //if nums[left…mid] is sorted, then the pivot element cannot be present
                left = mid + 1;
            
            else if(arr[mid] <= arr[right])
                right = mid - 1;
        }
        return -1;
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(findRotation(arr));
    }
}
