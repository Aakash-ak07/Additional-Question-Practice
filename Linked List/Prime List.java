// You are given the head of a linked list. You have to replace all the values of the nodes with the nearest prime number. If more than one prime number exists at an equal distance, choose the smallest one.

// Example 1:
// Input:
// 2 → 6 → 10
// Output:
// 2 → 5 → 11
// Explanation:
// The nearest prime of 2 is 2 itself.
// The nearest primes of 6 are 5 and 7,
// since 5 is smaller so, 5 will be chosen.
// The nearest prime of 10 is 11.
 

// Example 2:
// Input:
// 1 → 15 → 20
// Output:
// 2 → 13 → 19
// Explanation:
// The nearest prime of 1 is 2.
// The nearest primes of 15 are 13 and 17,
// since 13 is smaller so, 13 will be chosen.
// The nearest prime of 20 is 19.
// Your Task:
// The task is to complete the function primeList() which contains a reference to the head as the only argument. This function should return the head of the modified linked list.

// Expected Time Complexity: O(number of nodes * sqrt(value of node)).
// Expected Auxiliary Space: O(1).


class Solution
{
    Node primeList(Node head){
        Node temp = head;
        while(temp != null)
        {
            int t = temp.val;
            int i = 0;
            while(!isPrime(t - i) && !isPrime(t + i)) i++;
            if(isPrime(t - i)) 
                temp.val = t - i;
            else
                temp.val = t + i;
            temp = temp.next;
        }
        return head;
    }
    
    boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i = 2; i <= Math.sqrt(n); i++)
        {
            if(n % i == 0) 
                return false;
        }
        return true;
    }
}
