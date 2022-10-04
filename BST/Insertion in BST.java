// Given a BST and some keys, the task is to insert the keys in the given BST. Duplicates are not inserted. (If a test case contains duplicate keys, you need to consider the first occurrence and ignore duplicates).
/*
// Information about the Node class
class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}
*/

static Node insertInBST(Node root,int key)
{
    if(root == null)            
        return new Node(key);       //  root = new Node(key); return root;
                                        // we can use also this insted of else if case.
    else if(key == root.data)
        return root;

    else if(key < root.data)
        root.left = insertInBST(root.left, key);
    
    else
        root.right = insertInBST(root.right, key);

    return root;
}

