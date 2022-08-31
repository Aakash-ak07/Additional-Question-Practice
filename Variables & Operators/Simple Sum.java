//Given three integers A, B, and C, your task is to print the sum of these three integers.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a+b+c;
        System.out.println(sum);
    }
}


// Sample Input
// 1 2 3

// Sample Output:-
// 6
