// Prime Minister loves to travel with their cabinet ministers.

// Prime Minister has X cars that can seat 4 people and Y cars that can seat 7 people each. Determine the maximum number of people that can travel together in these cars.
// Input
// The first and only line of input contains a number of 4- seaters and 7- seater cars separated by space.

// Constraints:
// 1 <= X, Y <= 100
// Output
// Print the maximum number of people that can travel with the Prime Minister.
// Example
// Sample Input:
// 4 8

// Sample Output:
// 72

// Sample Input:
// 2 3

// Sample Output:
// 29

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int maxPeople = (x * 4) + (y * 7);
        System.out.print(maxPeople);
    }
}
