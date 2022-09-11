// In this season of love, everyone wants to surprise each other.
// You are also super excited and you wish to buy roses of 3 different colors. You always buy roses in order, white, yellow, red.
// So if you buy 7 roses, they will be "white, yellow, red, white, yellow, red, white".

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int seasonLove(int n)
    {
        int count = 0;
        for(int i = n; i > 0; i -= 3)
        {
            if( i >= 2)
                count++;
        }
        return count;
    }
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(seasonLove(n));
    }
}


// Sample Input 1
// 2

// Sample Output 1
// 1

// Sample Input 2
// 8

// Sample Ouput 2
// 3
