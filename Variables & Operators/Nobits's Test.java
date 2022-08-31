//Help Nobita to write a code for his gadget.
// You will be given two integers D and Q, you have to print the floor value of D/Q

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc=new Scanner(System.in);
        int D = sc.nextInt();
        int Q = sc.nextInt();
        if(Q==0)
        {
          System.out.println("-1");
        }
            
        else{
        System.out.println(D/Q);
        }
    }
}

// Sample Input:-
// 9 3

// Sample Output:-
// 3
// Note:- Remember division by 0 is an undefined value that will give runtime error in your program.
