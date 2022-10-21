// Given a string s consisting of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

// If the last word does not exist, return 0.

// Note: A word is defined as a character sequence consists of non-space characters only.
// Input
// Input contains a single line string.

// Constraints:

// 1 <= |String length| <= 100000
// Output
// Output the length of the last word.
// Example
// Sampe input 1
// Hello World

// Sample output 1
// 5


// Explanation
// Given s = "Hello World",

// return 5 as length("World") = 5.

// Please make sure you try to solve this problem without using library functions. Make sure you only traverse the string once.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(lengthOfLastWord(str));
    }
    public static int lengthOfLastWord(final String a)
    {
        boolean char_flag = false;
        int len = 0;
        for (int i = a.length() - 1; i >= 0; i--) 
        {
            if (Character.isLetter(a.charAt(i))) 
            {
                char_flag = true;
                len++;
            }
            else 
            {
                if (char_flag == true)
                    return len;
            }
        }
        return len;
    }
}
