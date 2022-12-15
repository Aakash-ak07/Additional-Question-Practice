// Given two unsorted arrays A of size N and B of size M of distinct elements, the task is to find all pairs from both arrays whose sum is equal to X.
// Note: All pairs should be printed in increasing order of u. For eg. for two pairs (u1,v1) and (u2,v2), if u1 < u2 then
// (u1,v1) should be printed first else second.

// Example 1:
// Input:
// A[] = {1, 2, 4, 5, 7}
// B[] = {5, 6, 3, 4, 8} 
// X = 9 
// Output: 
// 1 8
// 4 5 
// 5 4
// Explanation:
// (1, 8), (4, 5), (5, 4) are the
// pairs which sum to 9.

// Example 2:
// Input:
// A[] = {-1, -2, 4, -6, 5, 7}
// B[] = {6, 3, 4, 0} 
// X = 8 
// Output:
// 4 4 
// 5 3



/*
class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}
*/

class Solution {
    public pair[] allPairs( long A[], long B[], long N, long M, long X) {
        Arrays.sort(A);
        Arrays.sort(B);
        ArrayList<pair> list = new ArrayList<pair>();
        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < B.length; j++)
            {
                if(A[i] + B[j] == X)
                    list.add(new pair(A[i], B[j]));
            }
        }
        pair []p = new pair[list.size()];
        return list.toArray(p);
    }
}
