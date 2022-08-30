//Some Data types are given below:-Integer, Long, float, Double,char
//Your task is to take input in the given format and print them in the same order.

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
  public static void main (String[] args) {       
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    long b=sc.nextLong();
    float c=sc.nextFloat();
    double d=sc.nextDouble();
    char e=sc.next().charAt(0);

    System.out.println(a);
    System.out.println(b);
    System.out.printf("%.2f\n",c);
    System.out.printf("%.4f\n",d);
    System.out.print(e);
  }
}
