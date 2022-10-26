// Given an integer K and a queue of integers, your task is to reverse the order of the first K elements of the queue, leaving the other elements in the same relative order.
// Input
// User task:
// Since this will be a functional problem, you don't have to take input. You just have to complete the functions:
// ReverseK():- that takes the Queue and the integer K as parameter.

// Constraints:
// 1<=K<=N<=10000
// 1<=elements<=10000
// Output
// You need to return the modified Queue.
// Example
// Input 1:
// 5 3
// 1 2 3 4 5

// Output 1:
// 3 2 1 4 5

// Input 2:
// 5 5
// 1 2 3 4 5

// Output 2:
// 5 4 3 2 1


static Queue<Integer> ReverseK(Queue<Integer> queue, int k) { 
    if(queue.isEmpty() == true || k >queue.size())
        return null;
    if(k <= 0)      
        return null;
    
    Stack<Integer> st = new Stack<Integer>();
    for(int i = 0; i < k; i++)
    {
        st.push(queue.peek());
        queue.remove();
    }
    while(!st.empty()){
        queue.add(st.peek());
        st.pop();
    }
    for(int i = 0; i < queue.size() - k; i++)
    {
        queue.add(queue.peek());
        queue.remove();
    }
    return queue;
}
