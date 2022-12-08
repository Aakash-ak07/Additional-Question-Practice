// Given the chessboard dimensions. Find out the number of ways we can place a black and a white Knight on this chessboard such that they cannot attack each other.

// Note:
// The knights have to be placed on different squares. A knight can move two squares horizontally and one square vertically (L shaped), or two squares vertically and one square horizontally (L shaped). The knights attack each other if one can reach the other in one move.

// Example 1:

// Input:
// N = 2, M = 2
// Output: 12 
// Explanation: There are 12 ways we can place a black and a white Knight on this chessboard such that they cannot attack each other.

// Example 2:

// Input:
// N = 2, M = 3
// Output: 26
// Explanation: There are 26 ways we can place a black and a white Knight on this chessboard such that they cannot attack each other.

// Your Task:
// Your task is to complete the function numOfWays() which takes the chessboard dimensions N and M as inputs and returns the number of ways we can place 2 Knights on this chessboard such that they cannot attack each other. Since this number can be very large, return it modulo 109+7.

// Expected Time Complexity: O(N*M).
// Expected Auxiliary Space: O(1).


class BlackAndWhite
{
    static final long mod = (long)Math.pow(10, 9) + 7;
    static long numOfWays(int N, int M)
    {
        int[][] move = new int[][]{
           {-1, 2}, {1, 2}, {-1, -2}, {1, -2},
           {-2, -1}, {-2, 1}, {2, -1}, {2, 1}
        };
       
        long res = 0;
       
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                long count = 0;
               
                for(int k = 0; k < move.length; k++) {
                    if(helper(N, M, i + move[k][0], j + move[k][1])) {
                            count++;
                    }
                }
                count++;
                res = (res % mod) + ((M*N) % mod - (count % mod)) % mod;
            }
        }
        return res;
    }
   
    static boolean helper(int n, int m, int i, int j) {
        if(i < 0 || j < 0 || i >= n || j >= m) 
            return false;
        
        return true;
    }
}
