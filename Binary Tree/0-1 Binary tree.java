// Given the root of binary tree of binary values i.e. value of all nodes are either 0 or 1.

// Count the number of subtrees where number of nodes with value 1 is strictly greater than the number of nodes with value 0.
// Input
// You don't have to input anything, just complete the given function.

// Constrains
// 1 <= number of nodes <= 105
// 0 <= node's value <= 1
// Output
// Return the number of required subtrees.
// Example
// Input:
// 1 1 0 null 0 1

// Output:
// 2

// Explanation :
// 1 (1)
// / \
// (2) 1 0 (3)
// \ \
// (3) 0 1 (5)

// Subtrees rooted at node 5 and 1 have more number of 1 nodes than the number of 0 nodes.

// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode() {}
//     TreeNode(int val) { this.val = val; }
//     TreeNode(int val, TreeNode left, TreeNode right) {
//         this.val = val;
//         this.left = left;
//         this.right = right;
//     }
// }

class Solution {
   public int countSubtree(TreeNode root){
      if(root == null)
         return 0;
      int [] ans = new int[1];
      helper(root, ans);
      return ans[0];
   }

   public static int[] helper(TreeNode root, int[] res) {
      if(root == null)
         return new int[]{0, 0};
      
      int[] left = helper(root.left, res);
      int[] right = helper(root.right, res);
      int ones = left[0] + right[0] + (root.val == 1 ? 1 : 0);
      int zeros = left[1] + right[1] + (root.val == 0 ? 1 : 0);
      if (ones > zeros) 
         res[0]++;
      
      return new int[] {ones, zeros};
   } 
}
