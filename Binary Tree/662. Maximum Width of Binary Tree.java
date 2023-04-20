// Given the root of a binary tree, return the maximum width of the given tree.

// The maximum width of a tree is the maximum width among all levels.

// The width of one level is defined as the length between the end-nodes (the leftmost and rightmost non-null nodes), where the null nodes between the end-nodes that would be present in a complete binary tree extending down to that level are also counted into the length calculation.

// It is guaranteed that the answer will in the range of a 32-bit signed integer.

 

// Example 1:


// Input: root = [1,3,2,5,3,null,9]
// Output: 4
// Explanation: The maximum width exists in the third level with length 4 (5,3,null,9).


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
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;
        
        int width = 1;
        Queue<TreeNode> qu = new LinkedList<>();
        Queue<Integer> idxqu = new LinkedList<>();

        qu.offer(root);
        idxqu.offer(1);

        while(!qu.isEmpty())
        {
            int level = qu.size();
            int leftIdx = 0, rightIdx = 0;

            for(int i = 0; i < level; i++)
            {
                TreeNode temp = qu.poll();
                int idx = idxqu.poll();

                if(i == 0)
                    leftIdx = idx;
                if(i == level - 1)
                    rightIdx = idx;
                
                if(temp.left != null)
                {
                    qu.offer(temp.left);
                    idxqu.offer(idx * 2);
                }
                if(temp.right != null)
                {
                    qu.offer(temp.right);
                    idxqu.offer(idx * 2 + 1);
                }
            }
            width = Math.max(width, rightIdx - leftIdx + 1);
        }
        return width;
    }
}
