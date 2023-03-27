// When Alexa writes an integer, he uses a comma for every third digit from the right. For example, 1234567 is written as 1, 234, 567, and 777 is written as 777.
// How many commas will be used in total when she writes each integer from 1 through N once?
// Input
// The input consists of a single integer N.

// Constraints
// 1 ≤ N ≤ 10^15
// N is an integer.
// Output
// Print the total number of commas.
// Example
// Sample Input 1
// 1010
// Sample Output 1
// 11

// Sample Input 2
// 27182818284590
// Sample Output 2
// 107730272137364
  
  
  
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long ans = 0;
        if(n >= 1000)ans += n - 999;
        if(n >= 1000000)ans += n - 999999;
        if(n >= 1000000000)ans += n - 999999999;
        if(n >= 1000000000000l)ans += n - 999999999999l;
        if(n >= 1000000000000000l)ans += n - 999999999999999l;

        System.out.println(ans);
    }
}
