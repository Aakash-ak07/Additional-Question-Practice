// Given an array of N elements, for each element find the value of nearest element to the right which is having frequency greater than as that of current element. If there does not exist an answer for a position, then make the value ‘-1’.
// Input
// Firs line of input contains the size of the array N, next line contains N space separated integers depicting values of the array.

// Constraints:-
// 1 < = N < = 100000
// 1 < = Arr[i] < = 100000
// Output
// For each element print the value of nearest element to the right which is having frequency greater than as that of current element. If there does not exist an answer for a position, then make the value ‘-1’
// Example
// Sample Input:-
// 6
// 1 2 1 3 2 1

// Sample Output:-
// -1 1 -1 2 1 -1

// Sample Input:-
// 6
// 1 2 2 3 3 3

// Sample Output:-
// 2 3 3 -1 -1 -1


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int a[] = new int[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt() ;
        }

        int max = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++){
          if (a[i] > max){
				max = a[i];
			}
		}
		
      int freq[] = new int[max + 1];

		for (int i = 0; i < max + 1; i++){
			freq[i] = 0;
        }

		for (int i = 0; i < n; i++){
			freq[a[i]]++;
		}
      
		NFG(a, n, freq);
    }

    static void NFG(int a[], int n, int freq[]){


		Stack<Integer> s = new Stack<Integer>();
		s.push(0);
      
		int res[] = new int[n];

		for (int i = 0; i < n; i++){
			res[i] = 0;
        }

		for(int i = 1; i < n; i++){
			if(freq[a[s.peek()]] > freq[a[i]]){
				s.push(i);
            }
			else{
				while(s.size() > 0 && freq[a[s.peek()]] < freq[a[i]]){
					res[s.peek()] = a[i] ;
					s.pop() ;
				}

				s.push(i);
			}
		}

		while(s.size() > 0){
			res[s.peek()] = -1;
			s.pop();
		}

		for(int i = 0; i < n; i++){
			System.out.print(res[i] + " ");
		}
	}
}
