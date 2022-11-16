// In a new plot by Hydra to kill the avengers, Doctor Zola comes up with a new form of poison composed of chromosomes A, C, T and G. The poison is a string of length n (where n is divisible by 4) with each of the four letters occurring exactly n/4 times. For example, GACT and AAGTGCCT are both fatal poisons.Help Doctor Zola’s plan by choosing one (maybe empty) substring of minimal length in given poision and replace it with the new string (containing A,T,G,C) to make that poison fatal quickly.
// Input
// The first line of input contains a single integer N. The next line of input contains a string S of size N.

// Constraints:-
// 1 <= N <= 100000

// Note:- N is divisible by 4 and S will only contain {A, G, C, T}
// Output
// Print the length of the minimum length substring that can be replaced to detect the poison as fatal.
// Example
// Sample Input:-
// 8
// GAAATAAA

// Sample Output:-
// 5

// Explanation:-
// ATAAA can be replaced to TTCCG to get a fatal poison

// Sample Input:-
// 4
// AAAA

// Sample Output:-
// 3


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String str = scn.next();
        char[] arr = str.toCharArray();
        int[] arr2 = new int[4];    
        int freq = n/4;
        for(int i=0; i<n; i++)
        {
            char ch = arr[i];
            if(ch == 'A'){
               arr2[0] += 1;
            }
            else if(ch == 'T'){
               arr2[1] += 1;
            }
            else if(ch == 'C'){
               arr2[2] += 1;
            }
            else if(ch == 'G'){
               arr2[3] += 1;
            }
        }
         
        int l = 0, r = n;
        int mid = 0;
        int ans = -1;

        while(l<r)
        {
           mid = (l+r)/2;

            if(check(arr,mid,arr2,freq))
            {
                ans = mid;
                r = mid;
            }
            else{
                l = mid + 1;
            } 
        }
        System.out.println(ans);
	}

    public static boolean check(char[] arr,int mid,int[] arr2,int freq)
    {
        int curr = 0;
        int n = arr.length;
        int i= 0;
        int j = 0;

        while(j < mid)
        {
            char ch = arr[j];
            if(ch == 'A'){
                arr2[0] -= 1;
            } 
            else if(ch == 'T'){
                arr2[1] -= 1;
            }
            else if(ch == 'C'){
                arr2[2] -= 1;
            }
            else if(ch == 'G'){
                arr2[3] -= 1;
            }
            j++;   
        }
        if(arr2[0] <= freq && arr2[1] <= freq && arr2[2] <= freq && arr2[3] <= freq)
        { 
            while(i<j)
            {
                char ch = arr[i];
                if(ch == 'A'){
                    arr2[0] += 1;
                }
                else if(ch == 'T'){
                    arr2[1] += 1;
                }
                else if(ch == 'C'){
                    arr2[2] += 1;
                }
                else if(ch == 'G'){
                    arr2[3] += 1;
                }
                i++;   
            }
            return true;
        }
        while(j<n)
        {
            char ch = arr[j];
            if(ch == 'A'){
               arr2[0] -= 1;
            }
            else if(ch == 'T'){
               arr2[1] -= 1;
            }
            else if(ch == 'C'){
               arr2[2] -= 1;
            }
            else if(ch == 'G'){
               arr2[3] -= 1;
            }
            j++;  
            ch = arr[i];
            if(ch == 'A'){
               arr2[0] += 1;
            }
            else if(ch == 'T'){
               arr2[1] += 1;
            }
            else if(ch == 'C'){
               arr2[2] += 1;
            }
            else if(ch == 'G'){
               arr2[3] += 1;
            }
            i++;   
         
            if(arr2[0] <= freq && arr2[1] <= freq && arr2[2] <= freq && arr2[3] <= freq)
            {
                while(i<n && i<j)
                {
                    ch = arr[i];
                    if(ch == 'A'){
                        arr2[0] += 1;
                    }
                    else if(ch == 'T'){
                        arr2[1] += 1;
                    }
                    else if(ch == 'C'){
                        arr2[2] += 1;
                    }
                    else if(ch == 'G'){
                        arr2[3] += 1;
                    }
                    i++;   
                }
                return true;
            }
        }
        while(i<n)
        {
            char ch = arr[i];
            if(ch == 'A'){
               arr2[0] += 1;
            }
            else if(ch == 'T'){
               arr2[1] += 1;
            }
            else if(ch == 'C'){
               arr2[2] += 1;
            }
            else if(ch == 'G'){
               arr2[3] += 1;
            }
            i++;   
        }
        return false;
	  }
}
