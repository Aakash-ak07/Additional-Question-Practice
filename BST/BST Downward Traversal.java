// Given a Binary Search Tree and a target value. You have to find the node whose data is equal to target and return the sum of all descendant node's data which are vertically below the target node. Initially you are at the root node.
// Note: If target node is not present in bst then return -1.

//                25
//              /    \
//            20      35
//           / \      / \        
//         15  22   30  45  
//                   \
//                    32

//{ Driver Code Starts
//Initial Template for Java
import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}


class Solution
{
    long ans;
    Node temp;
    long verticallyDownBST(Node root,int target)
    {
        Node curr = root;
        while(curr != null)
        {
            if(curr.data == target)
                break;
            else if(curr.data > target)
                curr = curr.left;
            else
                curr = curr.right;
        }
        if(curr != null)
        {
            ans = 0;
            temp = curr;
            helper(curr, 0);
            return ans;
        }
        else
            return -1;
    }
    
    void helper(Node root, int val)
    {
        if(root == null)    return ;
        helper(root.left, val - 1);
        helper(root.right, val + 1);
        
        if(root != temp && val == 0)
            ans += root.data;
    }
}
