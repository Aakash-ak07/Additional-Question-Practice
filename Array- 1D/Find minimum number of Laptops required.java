// There are N jobs and the start and finish time of the jobs are given in arrays start[] and end[] respectively. Each job requires one laptop and laptops can't be shared. Find the minimum number of laptops required given that you can give your laptop to someone else when you are not doing your job.

// Example 1:
// Input:
// N = 3
// start[] = {1, 2, 3}
// end[] = {4, 4, 6}
// Output:
// 3
// Explanation:

// We can clearly see that everyone's supposed to
// be doing their job at time 3. So, 3 laptops
// will be required at minimum.

// Example 2:
// Input:
// N = 3
// start[] = {1, 5, 2}
// end[] = {2, 6, 3}
// Output :
// 1
// Explanation:
// All jobs can be done using 1 laptop only.



class Solution {
    public int minLaptops(int N, int[] start, int[] end) {
        Arrays.sort(start);
        Arrays.sort(end);
        
        int i = 0, j = 0, count = 0, maximum = 0;
        while(i < N && j < N)
        {
            if(start[j] < end[i])
            {
                count++;
                maximum = Math.max(maximum, count);
                j++;
            }
            else
            {
                count--;
                i++;
            }
        }
        return maximum;
    }
}
