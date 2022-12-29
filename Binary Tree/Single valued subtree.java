// Given a binary tree, count the number of Single Valued Subtrees. A Single Valued Subtree is one in which all the nodes have same value. 

// Example 1
// Input :
//               5
//              / \
//             1   5
//            / \   \
//           5   5   5
// Output : 4
// Explanation : 
// There are 4 subtrees with single values.

// Example 2:
// Input:
//               5
//              / \
//             4   5
//            / \   \
//           4   4   5   
// Output: 5
// Explanation: 
// There are five subtrees with single values.
// Your task :
// You don't have to read input or print anything. Your task is to complete the function singlevalued() which takes the root of the tree as input and returns the count of single valued subtrees.
 
// Expected Time Complexity : O(n)
// Expected Auxiliary Space : O(n)
 
// Constraints :
// 1 <= n <= 10^5



//User function Template for Java

/*class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}*/

class Solution
{
    public int singlevalued(Node root)
    {
        if(root == null)
            return 0;
        
        int count = 0;
        if(isSinglevalued(root))
            count++;
        
        count += singlevalued(root.left);
        count += singlevalued(root.right);
        
        return count;
    }
    
    public boolean isSinglevalued(Node root)
    {
        if(root == null)
            return true;
        if(root.left != null && root.left.data != root.data)
            return false;
            
        if(root.right != null && root.right.data != root.data)
            return false;
        
        return isSinglevalued(root.left) && isSinglevalued(root.right);
    }
}
