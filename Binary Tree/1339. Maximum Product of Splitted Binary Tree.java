// Given the root of a binary tree, split the binary tree into two subtrees by removing one edge such that the product of the sums of the subtrees is maximized.
// Return the maximum product of the sums of the two subtrees. Since the answer may be too large, return it modulo 109 + 7.
// Note that you need to maximize the answer before taking the mod and not after taking it.

// Example 1:
// Input: root = [1,2,3,4,5,6]
// Output: 110
// Explanation: Remove the red edge and get 2 binary trees with sum 11 and 10. Their product is 110 (11*10)

// Example 2:
// Input: root = [1,null,2,3,4,null,null,5,6]
// Output: 90
// Explanation: Remove the red edge and get 2 binary trees with sum 15 and 6.Their product is 90 (15*6)

// Constraints:

// The number of nodes in the tree is in the range [2, 5 * 104].
// 1 <= Node.val <= 104

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    long maxNum = Long.MIN_VALUE;
    long add = 0;
    public int maxProduct(TreeNode root) {
        sumOf(root);
        product(root, add);
        return (int)(maxNum % (int) 1000000007);
    }

    public void sumOf(TreeNode node)
    {
        if(node == null)
            return;
        add += node.val;
        sumOf(node.left);
        sumOf(node.right);
    }
    public long product(TreeNode node, long sum)
    {
        if(node == null)
            return 0;
            
        long l = product(node.left, sum);
        long r = product(node.right, sum);
        long sum1 = l + r + node.val;
        maxNum = Math.max(maxNum, sum1 * (sum - sum1));
        return sum1;
    }
}
