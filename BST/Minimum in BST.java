/*
// Information about the class Node
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
*/
static int minValue(Node node)
{
  if(node == null)  return -1;
  while(node.left != null)  
    node = node.left;
  
  return node.data;
}

//2nd method-

static int minValue(Node node)
{
  int val = node.data;
  while(node.left != null)
  {
    val = node.left.data;
    node = node.left;  
  }
  return val;
}
