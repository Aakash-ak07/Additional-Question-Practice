// A number N is represented in Linked List such that each digit corresponds to a node in linked list. You need to add 1 to it.

// Input:
// LinkedList: 4->5->6
// Output: 457 

// Example 2:

// Input:
// LinkedList: 1->2->3
// Output: 124 
/*
class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
        next = null;
    }
}
*/

 public static Node addOne(Node head) 
    { 
        head = revNode(head);
        Node temp = head;
        int carry = 1;
        while(temp!=null && carry!=0){
            int num = temp.data + 1;
            temp.data = num%10;
            carry = num/10;
            temp = temp.next;
        }
        if(carry == 1){
            Node new1 = new Node(1);
            temp = head;
            while(temp.next!=null)
              temp = temp.next;
            temp.next = new1;
        }
        head = revNode(head);
        return head;
        
    }
    public static Node revNode(Node head){
        Node temp = head;
        Node fast = head;
        Node slow = null;
        while(temp!=null){
            fast = fast.next;
            temp.next = slow;
            slow = temp;
            temp = fast;
        }
        return slow;
    }
