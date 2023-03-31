// Alexa loves to play with strings. She wants to know if her string consists of an equal number of consonants and vowels or not. Print Yes if the number of consonants is equal to the number of vowels.
// Input
// The input consists of a string S.

// Constraints
// S consists of lower case English alphabets.
// Output
// Print Yes if the number of vowels and consonants are equal else print No.
// starsASK AI
// BETA
// Simpler Explanation
// Concepts Used
// Example
// Sample Input 1
// aebecd
// Sample Output 1
// Yes

// Sample Input 2
// newton
// Sample Output 2
// No


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int cons = 0;
        int vow = 0;
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                vow++;
            } 
            else
            {
                cons++;
            }
        }
        if(cons == vow)
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
    }
}
