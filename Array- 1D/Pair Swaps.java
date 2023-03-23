// Given an array of N integers. Find the number of pairs (i, j) of integers satisfying all of the following conditions:
// 1 ≤ i < j ≤ N
// Ai ≠ Aj
// Input
// The first line of the input consists of an integer N. The second line consists of N space separated integers.

// Constraints
// All values in input are integers.
// 2 ≤ N ≤ 3×10^5
// 1 ≤ Ai ≤ 10^9
// Output
// Print the answer as an integer.
// Example
// Sample Input 1
// 3
// 1 7 1
// Sample Output 1
// 2

// Sample Input 2
// 10
// 1 10 100 1000 10000 100000 1000000 10000000 100000000 1000000000
// Sample Output 2
// 45


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        long count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) 
        {
            int val = arr[i];
            int freq = map.getOrDefault(val, 0);
            count += i - freq;
            map.put(val, freq + 1);
        }
        System.out.println(count);
    }
}
