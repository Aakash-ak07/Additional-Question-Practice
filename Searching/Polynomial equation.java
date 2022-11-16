// Given a function f(x) = ax2 + bx + c and an integer K. Find the minimum non - negative integer value of t such that f(t) >= K.
// Input
// First line contains four positive integers a, b, c, K.

// Constraints
// 1 <= a, b, c <=100
// 0 <= K <= 10^16
// Output
// Print the value of t.
// Example
// Sample Input 1:
// 1 1 1 1

// Output
// 0

// Explanation:
// f(0) = (0 + 0 + 1) >= 1

// Sample Input 2:
// 1 1 1 2

// Output
// 1

// Explanation:
// f(0) = 1 < 2
// f(1) = 3 >=2

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static long polynomialEquation(long a, long b, long c, long k)
    {
        for(int i = 0; i < 100000 * 100000; i++){
            long x = (a * i * i) + (b * i) + (c);
            if(x >= k)
                return i;
        }
        return -1;
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long k = sc.nextLong();
        long t = polynomialEquation(a, b, c, k);
        if(t >= k)
            System.out.print(k);

        else 
            System.out.print(t);
    }
}
