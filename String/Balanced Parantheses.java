// A balanced parentheses sequence is a sequence of parentheses such that each opening parenthesis has a matching closing parenthesis and the pairs of parentheses are properly nested. In other words, a balanced parentheses sequence must satisfy the following conditions:

// The sequence is empty, or The sequence is of the form "(S)", where S is a balanced parentheses sequence, or The sequence is of the form "S1S2", where S1 and S2 are balanced parentheses sequences. For example, the following are balanced parentheses sequences:

// ""
// "()"
// "((()))"
// "()()()"
// "(()(()))"

// And the following are not balanced parentheses sequences:

// "("
// ")"
// "()("
// "(()"
// "(()))"
// "())("

// Now, you are given two integers, A and B where A denotes the number of opening brackets i. e: ( and B denotes the number of closing brackets i. e: ). You need to report if you can build balanced parentheses using all of those brackets.
// Input
// The input consists of two space separated integers A and B.

// Constraints
// 0 ≤ A, B ≤ 10^9
// Output
// Print "YES" (without quotes) if you can build a balanced parentheses using the given brackets, otherwise print "NO" (without quotes).
// Example
// Sample Input 1
// 2 1
// Sample Output 1
// NO

// Sample Input 2
// 10 10
// Sample Output 2
// YES


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) 
        {
            System.out.println("YES");
        } 
        else 
        {
            System.out.println("NO");
        }
    }
}
