//Given a side of a square, your task is to calculate its area.
  
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
      int side, area;
      Scanner sc = new Scanner(System.in);
      side = sc.nextInt();
      area = side* side;
      System.out.println(area);
    }
}


// Sample Input:-
// 3

// Sample Output:-
// 9
