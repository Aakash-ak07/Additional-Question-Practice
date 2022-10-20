// Height of Binary Tree


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

int calculateHeight(Node root) {
    if (root == null)
      return 0;  // return -1;  (as per question demand)
    return Math.max(calculateHeight(root.left), calculateHeight(root.right)) + 1;
}
