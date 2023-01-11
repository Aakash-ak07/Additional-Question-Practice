// You are given N elements, you can remove any two elements from the list, note their sum, and add the sum to the list. 
// Repeat these steps while there is more than a single element in the list. The task is to minimize the sum of these chosen sums.

// Example 1:
// Input:
// N = 4
// arr[] = {1, 4, 7, 10}

// Output:
// 39

// Explanation:
// Choose 1 and 4, Sum = 1 + 4 = 5.
// arr[] = {5, 7, 10} 
// Choose 5 and 7, Sum = 5 + (5 + 7) = 17.
// arr[] = {12, 10} 
// Choose 12 and 10, Sum = 17 + (12 + 10) = 39.
// arr[] = {22}
 

// Example 2:
// Input:
// N = 5
// arr[] = {1, 3, 7, 5, 6}

// Output:
// 48
 

class Solution {
    long minimizeSum(int N, int arr[]) {
        PriorityQueue<Long>pq = new PriorityQueue<>();
        long res = 0;
        for(int i : arr)
           pq.add(i * 1l); 
        
        while(pq.size() > 1)
        {
            long a = pq.poll(), b = pq.poll();
            long sum = a + b;
            pq.add(sum);
            
            res += sum;
        }
        return res;
    }
}
