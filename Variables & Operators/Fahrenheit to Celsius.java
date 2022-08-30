// Given a temperature F in Farenheit, your task is to convert it into Celsius using the following equation:-
// T(°c) = (T(°f) - 32)*5/9

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int ft = sc.nextInt();
        int c;
        c = ((ft - 32)*5/9);
        System.out.println(c);
    }
}
