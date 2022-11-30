// Given a singly linked list: A0→A1→...→An-2→An-1, reorder it to: A0→An-1→A1→An-2→A2→An-3→...
// For example: Given 1->2->3->4->5 its reorder is 1->5->2->4->3.

// Note: It is recommended do this in-place without altering the node's values.

// Example 1:

// Input:
// LinkedList: 1->2->3
// Output: 1 3 2
// Explanation:
// Here n=3, so the correct
// order is A0→A2→A1

// Example 2:

// Input:
// Explanation: 1->7->3->4
// Output: 1 4 7 3
// Explanation:
// Here n=4, so the correct
// order is A0→A3→A1→A2

// Your Task:
// The task is to complete the function reorderList() which should reorder the list as required. The reorder list is automatically printed by the driver's code.

// Note: Try to solve without using any auxilliary space.

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)

// Constraints:
// 1 <= N <= 5*105
// 1 <= A[ i ] <= 105


//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

  public class ReorderList {
    Node head; // head of lisl
    Node last; // last of linked list

    /* Linked list Node*/

    /* Utility functions */

    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
            last = head;
        } else {
            // Node temp = head;
            // while (temp.next != null) temp = temp.next;

            last.next = node;
            last = last.next;
        }
    }
    /* Function to print linked list */
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Drier program to test above functions */
    public static void main(String args[]) {

        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            ReorderList llist = new ReorderList();

            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }

            llist.head = new Solution().reorderlist(llist.head);

            llist.printList();

            t--;
        }
    }
}
// } Driver Code Ends

class Solution {
    Node reorderlist(Node head) {
        if(head == null || head.next == null)
            return head;

        Node mid = midNode(head);
        Node headSlow = reverseList(mid);
        Node headfast = head;

        while(headfast != null && headSlow != null)
        {
            Node temp = headfast.next;
            headfast.next = headSlow;
            headfast = temp;
            temp = headSlow.next;
            headSlow.next = headfast;
            headSlow = temp;
        }
        if(headfast!=null)
        {
            headfast.next=null;
        }
        return head;
            
    }
    
    public Node midNode(Node head)
    {
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public Node reverseList(Node head)
    {
        Node prev = null;
        Node current = head;
        while(current != null)
        {
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }
}
