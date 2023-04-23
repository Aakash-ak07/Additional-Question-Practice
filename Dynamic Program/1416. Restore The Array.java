// A program was supposed to print an array of integers. The program forgot to print whitespaces and the array is printed as a string of digits s and all we know is that all integers in the array were in the range [1, k] and there are no leading zeros in the array.

// Given the string s and the integer k, return the number of the possible arrays that can be printed as s using the mentioned program. Since the answer may be very large, return it modulo 109 + 7.

 

// Example 1:
// Input: s = "1000", k = 10000
// Output: 1
// Explanation: The only possible array is [1000]

// Example 2:
// Input: s = "1000", k = 10
// Output: 0
// Explanation: There cannot be an array that was printed this way and has all integer >= 1 and <= 10.
  
// Example 3:
// Input: s = "1317", k = 2000
// Output: 8
// Explanation: Possible arrays are [1317],[131,7],[13,17],[1,317],[13,1,7],[1,31,7],[1,3,17],[1,3,1,7]
 




class Solution {
    public int numberOfArrays(String s, int k) {
        int mod =  1000000007;
        int n =  s.length();
        int dp[] =  new int[n + 1];
        dp[0] =  1;
        
        for(int i=1;i<=n;i++)
        { 
            int ans = 0;
            int start =  n - i; 
            for(int j = start ; j < Math.min(n,start + 9); j++)
            { 
                String num =  s.substring(start,j+1);  
                if(num.charAt(0)=='0') continue;
                int val =  Integer.parseInt(num);
                if(val<=k)
                { 
                    ans = (ans + dp[n - j - 1]) % mod;
                }
                else
                {
                    break;
                }
                
            }
            dp[i] = ans % mod;   
        }
        return dp[s.length()];
    }
}
