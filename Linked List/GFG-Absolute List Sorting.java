// Given a linked list of N nodes, sorted in ascending order based on the absolute values of its data,i.e. negative values are considered as positive ones. 
//Sort the linked list in ascending order according to the actual values, and consider negative numbers as negative and positive numbers as positive.

// Example 1:
// Input: 
// List: 1, -2, -3, 4, -5
// Output: 
// List: -5, -3, -2, 1, 4
// Explanation: 
// Actual sorted order of {1, -2, -3, 4, -5}
// is {-5, -3, -2, 1, 4}

// Example 2:
// Input: 
// List: 5, -10
// Output: 
// List: -10, 5
// Explanation:
// Actual sorted order of {5, -10}
// is {5, 10}


class Solution
{
	Node sortList(Node head) {
		Queue<Integer> qu = new LinkedList<>();
		Stack<Integer> st = new Stack<>();
		Node temp = head;
		while(temp != null)
		{
		    if(temp.data < 0)
		    {
		        st.add(temp.data);
		    }
		    else
		    {
		        qu.add(temp.data);
		    }
		    temp = temp.next;
		}
		temp = head;
		while(!st.isEmpty())
		{
		    temp.data = st.pop();
		    temp = temp.next;
		}
		while(!qu.isEmpty())
		{
		    temp.data = qu.poll();
		    temp = temp.next;
		}
		return head;
	}
}
