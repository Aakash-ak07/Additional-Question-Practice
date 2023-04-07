// You are given an array of n integers a1, a2, …, an. After you watched the amazing film "All At Once", you came up with the following operation. In one operation, you choose n−1 elements of the array and replace each of them with their arithmetic mean (which doesn't have to be an integer). For example, from the array [1, 2, 3, 1] we can get the array [2, 2, 2, 1], if we choose the first three elements, or we can get the array [43, 43, 3, 43], if we choose all elements except the third.
// Is it possible to make all elements of the array equal by performing a finite number of such operations?
// Input
// The first line of the input consists of an integer n. The second line of the input consists of n space- separated integers.

// Constraints
// 3 ≤ n ≤ 50
// 0 ≤ ai ≤ 100
// Output
// If it is possible to make all elements equal after some number of operations, output Yes. Otherwise, output No.


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) 
        {
            sum += arr[i];
        }
        if (sum % n != 0) 
        {
            System.out.println("No");
            return;
        }
        int target = sum / n;
        for (int i = 0; i < n; i++) 
        {
            if (arr[i] == target) 
            {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
