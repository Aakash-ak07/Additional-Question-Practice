// You are given an array of n elements, initially all a[i] = 0. Q queries need to be performed. Each query contains three integers l, r, and x  and you need to change all a[i] to (a[i] | x) for all l ≤ i ≤ r.

// Return the array after executing Q queries.

// Example 1:
// Input:
// N=3, Q=2
// U=[[1, 3, 1],
//    [1, 3, 2]]

// Output:
// a[]={3,3,3}

// Explanation: 
// Initially, all elements of the array are 0. After execution of the
// first query, all elements become 1 and after execution of the 
// second query all elements become 3.
  
// Example 2:
// Input:
// N=3, Q=2
// U=[[1, 2, 1],
//    [3, 3, 2]]

// Output:
// a[]={1,1,2}

// Explanantion:
// [0,0,0] => [1,1,0] => [1,1,2]

class Solution{
	int [] updateQuery(int N, int Q, int [][]U){
        int ans[] = new int[N];
        for(int i = 0; i < Q; i++)
        {
            int l = U[i][0];
            int r = U[i][1];
            int x = U[i][2];
            
            for(int j = l - 1; j < r; j++)
            {
                ans[j] = ans[j] | x;
            }
        }
        return ans;
    }
}
