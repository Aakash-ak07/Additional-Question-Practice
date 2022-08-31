// Nobita wants to become rich so he came up with some ideas. Nobita buys some gadgets from the future at a price of C and sells them at a price of S to his friends. 
// Now Nobita wants to know how much he gains by selling 1 gadget. As we all know Nobita is weak in maths help him to find the profit he gets

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc= new Scanner(System.in);

        int cp=sc.nextInt();
        int sp=sc.nextInt();

        int p=sp-cp;
        System.out.println(p);
    }
}


// Sample Input:-
// 3 5

// Sample Output:-
// 2
