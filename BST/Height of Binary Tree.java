// Given a binary tree, find height of it.

//      1
//     / \
//    10  39
//    /
//   5

// The above tree has a height of 3.
// Note: Height of empty tree is considered 0.

/*
class Node
{
    int data;
    Node left, right;
    Node(int data)
   {
      this.data = data;
      this.left = this.right = null;
   }
}
*/

static int getHeight(Node node) 
{
   if(node == null)
      return 0;
   
   return Math.max(getHeight(node.left), getHeight(node.right)) + 1;
}

// Sample Input:
// 1
// 3
// 1 2 3

// Sample Output:
// 2

// Explanation:
// Testcase1: The tree is
// 1
// / \
// 2 3
// So, the height would be 2.
