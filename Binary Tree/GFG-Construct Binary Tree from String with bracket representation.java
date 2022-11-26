// Construct a binary tree from a string consisting of parenthesis and integers. The whole input represents a binary tree. It contains an integer followed by zero, one or two pairs of parenthesis. The integer represents the roots value and a pair of parenthesis contains a child binary tree with the same structure. Always start to construct the left child node of the parent first if it exists.

// Example 1:

// Input: "1(2)(3)" 
// Output: 2 1 3
// Explanation:
//            1
//           / \
//          2   3
// Explanation: first pair of parenthesis contains 
// left subtree and second one contains the right 
// subtree. Inorder of above tree is "2 1 3".

// Example 2:

// Input: "4(2(3)(1))(6(5))"
// Output: 3 2 1 4 5 6
// Explanation:
//            4
//          /   \
//         2     6
//        / \   / 
//       3   1 5   


//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node
{
    int data;
    Node left;
    Node right;
    
    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
    
    public static Node buildTree(String str)
    {
        // Corner Case
        if(str.length()==0 || str.charAt(0)=='N')
            return null;
        
        // Creating array of Strings from input 
        // String after spliting by space
        String ip[] = str.split(" ");
        
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        
        // Push the root to the queue
        Queue<Node> queue = new LinkedList<>(); 
        queue.add(root);
        
        // Starting from the second element
        int i = 1;
        while(queue.size()>0 && i < ip.length)
        {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N"))
            {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N"))
            {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        return root;
    }
    
    public static Node inputTree(BufferedReader br) throws IOException
    {
        return buildTree(br.readLine().trim());
    }
    
    public static void inorder(Node root)
    {
        if (root == null)
           return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String s; 
            s = br.readLine();
            
            Solution obj = new Solution();
            Node res = obj.treeFromString(s);
            
            Node.inorder(res);
            System.out.println();
        }
    }
}

// } Driver Code Ends

class Solution {
    public static Node treeFromString(String s) {
        return helper(s, 0, s.length()-1);
    }
    
    public static Node helper(String str, int left, int right)
    {
        if(left > right)
            return null;
            
        int x = left;
        while(x <= right){
            char ch = str.charAt(x);
            if(ch >= '0' && ch <= '9')
                x++;
            else
                break;
        }
        Node res = new Node(Integer.parseInt(str.substring(left, x)));
        
        int j = x;
        Stack<Character> st = new Stack<>();
        while(j <= right){
            char ch = str.charAt(j);
            if(ch == ')' )
                st.pop();
            else if(ch == '(')
                st.push('(');
                
            if(st.size() == 0) break;
            j++;
        }
        res.left = helper(str, x + 1, j - 1);
        if(j + 2 < right) 
            res.right = helper(str, j + 2, right - 1);
        
        return res;
    }
}
