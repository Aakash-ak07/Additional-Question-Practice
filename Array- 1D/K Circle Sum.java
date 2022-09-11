// N numbers are arranged in Circle. Find the Sum of all K contiguous Sub-arrays.

static void  kCircleSum(int arr[],int n,int k){
    int sum=0;
    for(int i =0; i<k;i++)
    {
        sum+=arr[i];
    }
    for(int i=k;i<n+k;i++)
    {
        System.out.print(sum+" ");
        sum+=arr[i%n]-arr[(i-k)%n];
    }
}

// Sample Input
// 3 1
// 1 2 3

// Sample Output
// 1 2 3

// Explanation : k=1 so ans is 1, 2, and 3.

// Sample Input
// 5 2
// 6 4 3 4 1

// Sample Output
// 10 7 7 5 7
