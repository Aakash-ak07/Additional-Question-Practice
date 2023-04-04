// You have r red and b blue beans. You'd like to distribute them among several (maybe, one) packets in such a way that each packet:
// 1. Has at least one red bean (or the number of red beans ri ≤ 1);
// 2. Has at least one blue bean (or the number of blue beans bi ≤ 1);
// 3. The number of red and blue beans should differ in no more than d (or |ri−bi| ≤ d)
// Can you distribute all beans?
// Input
// The input consists of three space- separated integers r, b, and d — the number of red and blue beans and the maximum absolute difference in each packet.

// Constraints
// 1 ≤ r, b ≤109
// 0 ≤ d ≤109
// Output
// If you can distribute all beans, print Yes. Otherwise, print No.
//   Sample Input 1
// 1 1 0
// Sample Output 1
// Yes

// Sample Input 2
// 6 1 4
// Sample Output 2
// No

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int b = sc.nextInt();
        int d = sc.nextInt();

        if (Math.abs(r - b) <= d * Math.max(1, Math.min(r, b)))
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
    }
}
