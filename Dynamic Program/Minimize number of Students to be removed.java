// N Students of different heights are attending an assembly. The heights of the students are represented by an array H[]. 
// The problem is that if a student has less or equal height than the student standing in front of him, then he/she cannot see the assembly. 
// Find the minimum number of students to be removed such that maximum possible number of students can see the assembly. 

// Example 1:
// Input:
// N = 6
// H[] = {9, 1, 2, 3, 1, 5}
// Output:
// 2
// Explanation:
// We can remove the students at 0 and 4th index.
// which will leave the students with heights
// 1,2,3, and 5.

// Example 2:
// Input:
// N = 3
// H[] = {1, 2, 3} 
// Output :
// 0
// Explanation:
// All of the students are able to see the
// assembly without removing anyone.

// Your Task:  
// You don't need to read input or print anything. Your task is to complete the function removeStudents() which takes an integer N and an array H[ ] of size N as input parameters and returns the minimum number of students required to be removed to enable maximum number of students to see the assembly.

// Expected Time Complexity: O(N logN)
// Expected Auxiliary Space: O(N)

// Constraints:
// 1 ≤ N ≤ 105
// 1 ≤ H[i] ≤ 105


class Solution {
    public int removeStudents(int[] H, int N) {
        int ans = N - helper(H);
        return ans;
    }
    
    public int helper(int[] arr)
    {
        int dp[] = new int[arr.length];
        int n = 0;
        for(int num : arr)
        {
            int i = Arrays.binarySearch(dp, 0, n, num);
            if(i < 0)
            {
                i = -(i + 1); 
            }
            dp[i] = num;
            if(i == n)
                n++;
        }
        return n;
    }
}
