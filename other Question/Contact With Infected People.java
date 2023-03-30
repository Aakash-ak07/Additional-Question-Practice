// The Years 2020, and 2021 are pandemic years where people have suffered from Corona Virus. There were situations where accommodation was crucial. One such issue is now in front of us which we need to resolve.

// A hostel has N rooms in a straight line. It has to accommodate X people. Unfortunately, out of these X people, Y of them are infected with Corona Virus. Due to safety norms, the following precaution must be taken:

// No person should occupy a room directly adjacent to a room occupied by a Covid- infected person. In particular, two Covid- infected people cannot occupy adjacent rooms.

// For example, if room 4 has a Covid- infected person, then nobody should occupy rooms 3 and 5. Similarly, if room 1 has a Covid- infected person then nobody should occupy room 2.

// What's the minimum value of N for which all the people can be accommodated in the hostel, following the above condition?
// Input
// Each test case contains the total number of people and the number of Covid- infected people.

// Constraints:
// 1 ≤ X ≤ 1000
// 0 ≤ Y ≤ X
// Output
// For each test case, output on a new line a single integer — the minimum value of N for which all the people can be accommodated in the hostel.
// Example
// Sample Input:
// 4 0

// Sample Output:
// 4

// Sample Input:
// 5 3

// Sample Output:
// 8


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a == b)
        {
            System.out.print(a + b - 1);
        }
        else
        {
            System.out.print(a + b);
        }
    }
}
