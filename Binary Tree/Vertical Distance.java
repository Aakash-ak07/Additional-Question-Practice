// A vertical distance is the distance of a node from the imaginary vertical line passing through the root node. The vertical distance of the root node is 0. If you go to the right child of the current node, the vertical distance increases by 1 and if you go to the left child of the current node, the vertical distance decreases by 1.

// Given a binary tree with N nodes rooted at node 1, and given Q queries, print the vertical distance of the node in the ith query.

// See sample for better understanding.
// Input
// First line contains the integer N and Q, denoting the number of nodes in the binary tree and the number of queries respectively.
// Next N lines contains two integers, denoting the left and right child of the i-th node respectively.
// If the node doesn't have a left or right child, it is denoted by '-1'
// Next Q lines contain a single integer p.

// 1 <= N, Q <= 100000
// 1 <= p <= N
// Output
// Print Q lines containing the answer to a particular query.
// Example
// Sample Input 1:
// 7 7
// 2 4
// 5 3
// -1 -1
// -1 7
// 6 -1
// -1 -1
// -1 -1
// 1
// 2
// 3
// 4
// 5
// 6
// 7

// Sample output 1:
// 0
// -1
// 0
// 1
// -2
// -3
// 2

// Explanation: Given binary tree
// 1
// / \
// 2 4
// / \ \
// 5 3 7
// /
// 6


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
    
class Main{
    static class Node{
        int key;
        Node left , right ;
    
        Node(int data) {
            key = data;
            left = null;
            right = null;
        }
    }

    public static void verticalDistance(Node root, int hd, int m[])
    {
        if(root == null)
            return;
    
        m[root.key] = hd;

        verticalDistance(root.left, hd - 1, m);
        verticalDistance(root.right, hd + 1, m);
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        Node[] arr = new Node[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = new Node(i);
        }    
        for(int i = 0; i < n; i++)
        {
            int l = sc.nextInt();
            int r = sc.nextInt();
            if(l != -1)
            {
                l--;
                arr[i].left = arr[l];
            }
            if(r != -1)
            {
                r--;
                arr[i].right = arr[r];
            }
        }
        int m[] = new int[n];
        int hd = 0;
        verticalDistance(arr[0], hd, m);
        for(int i = 0; i < q; i++)
        {
            int node = sc.nextInt();
            System.out.println(m[node - 1]);
        }
    }
}
