// We have A balls with the string S written on each of them and B balls with the string T written on each of them.
// Alice has two boxes. One contains A cubes with the string S written and other contains B cubes with the string T written.
// From these two boxes, Alice chooses one with the string U written on it and throws it away.
// Find the number of cubes in each of the box.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();
        int n = sc.nextInt();
        int n2 = sc.nextInt();

        String x = sc.next();
        if(x.equals(str))
        {
            n -= 1;
        }
        else
        {
            n2 -= 1;
        }
        System.out.print(n + " " + n2);
    }
}

// Sample Input 1:
// red blue
// 3 4
// red

// Sample Output 1:
// 2 4

// Explanation: Alice chose a cube with red written on it and threw it away. Now we have two cubes with the string S and four cubes with the string T.

// Sample Input 2:
// red blue
// 5 5
// blue

// Sample Output 2:
// 5 4

// Explanation: Alice chose a cube with blue written on it and threw it away. Now we have five cubes with the string S and four cubes with the string T.
