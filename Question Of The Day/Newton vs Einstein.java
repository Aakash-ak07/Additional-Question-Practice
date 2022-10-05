// Newton and Einstein are fighting each other and each has some healthpoints and some attackpoints.
// Newton has P HealthPoints and Q AttackPoints whereas Einstein has R HealthPoints and S AttackPoints.
// Newton attacks first followed by Einstein. They attack alternately then. Each attack on a person decreases his healthpoints by a total amount of the attacking points of the attacker.
// A person would lose if his healthpoints become 0 or less than 0.
// https://my.newtonschool.co/playground/code/5695573rpwr4/
// Print "Yes" is Newton wins, otherwise "No" (The output is case sensitive)
// Input
// The first and the only line of the input consists of 4 integers, P, Q, R and S

// Constraints:
// 1 <= P, Q, R, S <= 100
  
// Example
// Sample Input 1:
// 10 9 10 10

// Sample Output 1:
// No

// Sample Input 2:
// 46 4 40 5
// Sample Output 2:
// Yes

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        int s = sc.nextInt();

        if(q == 0 && s != 0)
        {
            System.out.print("No");
            return;
        }
        
        while(p > 0 &&  r > 0)
        {
            r = r - q;
            if(r <= 0)
            {
                System.out.print("Yes");
                return;
            }
            p = p - s;
            if(p <= 0)
            {
                System.out.print("No");
                return;
            }
        }
    }
}
