// Given a Node D of a linked list containing N unique nodes i.e the value at each node is unique, your task is to delete the given node from the list.

// Note:- It is guaranteed that the given node is not the last node of the list and D is always present in the linked list
// Input
// User Task:
// Since this will be a functional problem, you don't have to take input. You just have to complete the function deleteNode() that takes the given node D as parameter.

// Constraints:
// 1 <= N <= 1000
// 1 < = Node.data < = 100000
// 1 <= D <= Node.data

// Custom Input:-
// First line should contains number of Nodes N and the node val to be deleted, next line contains N space separated integers denoting the values of nodes.
// Output
// You don't need to print or return anything printing will be done by the driver code.
// Example
// Sample Input:-
// List:- 2 - > 3 - > 4 - > 5
// Given node:-3

// Sample Output:-
// 2 - > 4 - > 5

    /*
    class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }
    */

    public static void deleteNode(Node D) {
        if(D == null)
            return;
        
        else
        {
            if(D.next == null)
                return;
        }
        Node temp = D.next;
        D.val = D.next.val;
        D.next = D.next.next;
    }
