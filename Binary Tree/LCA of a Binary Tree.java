// https://mycode.prepbytes.com/problems/trees/LCA1

// You have been given the root of a binary tree and two node's values P and Q. You have to find the value of node that is Lowest Common Ancestor to nodes P and Q
// Note - The lowest common ancestor is defined between two nodes P and Q as the lowest node in Binary Tree that has both P and Q as descendants (where we allow a node to be a descendant of itself).
// Input Format
// The Root of the tree, P, and Q

//  is passed to the LCA() function.
// And the tree is constructed in level order format.
// Output Format

// Output the value of that node which is LCA to both the nodes P and Q

// Constraints

// 1≤N≤104
// , where N

//  is the number of nodes in the binary tree.
// Example
// Sample Input

// 1 5 3 -1 4 2 -1 -1 -1 -1 -1
// 3 5
// Sample Output

// 1
// Sample Testcase Explanation

//           1
//         /   \
//        5     3
//       / \   / \
//      -1  4 2  -1
//         /\ /\
//        -1-1-1-1
  
// LCA for nodes whose value are 5 and 3 is node with value 1


/* Complete the function LCA given below
For your reference:

class Node
{
    long value;
    Node left, right;
    public Node(long item)
    {
        value = item;
        left = right = null;
    }
}
*/

Node LCA(Node node, int n1, int n2) {
    if(node == null) return null;
    
    if(node.value == n1 || node.value == n2) return node;
    
    Node left = LCA(node.left, n1, n2);       
    Node right = LCA(node.right, n1, n2); 
    
    if(left == null) return right;
    if(right == null) return left;
      
    return node;
}
----------------------------------------
  // Full Code PrepByte 
-----------------------------------------
import java.util.*;
import java.io.*;

class Node
{
    long value;
    Node left, right;
    public Node(long item)
    {
        value = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;
    BinaryTree() {
        root = null;
    }

    Node createNode(long value) {
        Node t = new Node(value);
        return t;
    }
  
    Node replaceNegativeOne(Node root) {
        if (root == null || (root.value == -1 && root.left == null && root.right == null)) {
            return null;
        }
        root.left = replaceNegativeOne(root.left);
        root.right = replaceNegativeOne(root.right);
        return root;
    }

    Node createTreeByLevelTree(Scanner sc ) {
        long n, m;
        LinkedList<Node> queue = new LinkedList<>();
        Node t;
        root = null;
        while (sc.hasNext()) {
            n = sc.nextLong();
            if (queue.isEmpty()) {
                root = createNode(n);
                queue.add(root);
                continue;
            }
            m = sc.nextLong();
            t = queue.peekFirst();
            queue.pop();
            t.left = createNode(n);
            t.right = createNode(m);

            if (t.left.value != -1)
                queue.add(t.left);
            if (t.right.value != -1)
                queue.add(t.right);
            if (queue.isEmpty())
                break;
        }
          return root;
    }
  
    void deleteTree(Node node) {
        node = null;
    }
  
  Node LCA(Node node, int n1, int n2) {

      if(node == null) return null;
      if(node.value == n1 || node.value == n2) return node;

      Node left = LCA(node.left, n1, n2);       
      Node right = LCA(node.right, n1, n2); 

      if(left == null) return right;
      if(right == null) return left;

      return node;
    }
  }

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        BinaryTree bt = new BinaryTree();
        bt.root = bt.createTreeByLevelTree(sc);
        bt.root = bt.replaceNegativeOne(bt.root);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        Node val = bt.LCA(bt.root, n1,n2);
        System.out.println(val.value);
        bt.deleteTree(bt.root);
    }
}


