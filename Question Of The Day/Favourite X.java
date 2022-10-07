// Alice loves a string with every character x but he has a string s. Can you make such a string for him?
// Input
// The first line contains a single string s.

// Constraints:
// S is a string consisting of lowercase English letters.
// The length of S is between 1 and 100 (inclusive).

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        for(int i = 0; i < n; i++)
        {
            if(str.charAt(i) != 'x')
                System.out.print("x");
            
            else
                System.out.print(str.charAt(i));
        }
    }
}

// Sample Input 1:
// sardine

// Sample Output 1:
// xxxxxxx

// Sample Input 2:
// xxxx

// Sample Output 2:
// xxxx
