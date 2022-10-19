// Given a singly linked list, delete middle node of the linked list. For example, if given linked list is 1->2->3->4->5 then linked list should be modified to 1->2->4->5.
// If there are even nodes, then there would be two middle nodes, we need to delete the second middle element. For example, if given linked list is 1->2->3->4->5->6 then it should be modified to 1->2->3->5->6.
// // In case of a single node return the head of a linked list containing only 1 node which has value -1
// User Task:
// Since this will be a functional problem, you don't have to take input. You just have to complete the function deleteMiddleElement() that takes head node of the linked list as parameter.

// Constraints:
// 1 <=N<= 1000
// 1 <=value<= 1000
// Output
// Return the head of the modified linked list
// Example
// Sample Input 1:
// 5
// 1 2 3 4 5

// Sample Output:
// 1 2 4 5


// Explanation: After deleting middle of the linked list, 3 will be deleted and the list will be as 1, 2, 4, 5.

// Sample Input 2:
// 6
// 1 2 3 4 5 6

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

public static Node deleteMiddleElement(Node head) {
    if(head == null || head.next == null)
        return new Node(-1);
    
    Node mid = findMid(head);
    mid.next = mid.next.next;
    return head;
}
public static Node findMid(Node head)
{
    Node slow = head;
    Node fast = head;
    boolean x = true;
    while(fast != null && fast.next != null)
    {
        fast = fast.next.next;
        if(!x)
        {
            slow = slow.next;
        }
        else{
            x = false;
        }
    }
    return slow;
}
