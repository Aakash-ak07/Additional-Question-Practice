// You are given an array(Arr) of N Distinct integers. You have to find the sum of minimum element of all the subarrays (continous) in that array. See Sample for better understanding.
// Input
// The first line of input contains N, the size of the array
// The second line of input contains N space-separated integers
// Constraints
// 2 ≤ N ≤ 100000
// 1 ≤ Arr[i] ≤ 1000000000
// Output
// The output should contain single integers, the sum of minimum element of all the subarrays in that array.
// Example
// Sample Input
// 3
// 1 2 3

// Sample Output
// 10

// Explaination
// all subarrays [1] [1,2] [1,2,3] [2] [2,3] [3]
// Sum of minimums : 1 + 1 + 1 + 2 + 2 + 3 = 10

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    
    static class Pair{
        long value;
        long count;

        Pair(long value, long count){
            this.value = value;
            this.count = count;
        }
    }
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        for(int i=0; i<n; i++)
            a[i] = sc.nextInt();

        long L[] = new long[n];
        long R[] = new long[n];
        Stack<Pair> myStack = new Stack<>();

        for(int i=0;i<n;i++){
            long value = a[i];
            long count = 1;

            while (!myStack.isEmpty() && myStack.peek().value >= value) {
                count += myStack.pop().count;
            }

            Pair p = new Pair(value, count);
            myStack.push(p);
            L[i] = count;
        }

        //        for(int x : L)
        //            System.out.print(x + " ");

        //Right Side
        myStack.clear();
        for(int i=n-1;i>=0;i--){
            long value = a[i];
            long count = 1;

            while (!myStack.isEmpty() && myStack.peek().value >= value) {
                count += myStack.pop().count;
            }

            Pair p = new Pair(value, count);
            myStack.push(p);
            R[i] = count;
        }
    //        System.out.println();
    //        for(int x : R)
    //        System.out.print(x + " ");
        long ans = 0;
        for(int i=0; i<n; i++){
            ans += a[i] * L[i] * R[i];
        }

        System.out.println(ans);
    }
}
