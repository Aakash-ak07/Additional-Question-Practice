// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] 
// such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null) return null;
        int n = nums.length;
        Arrays.sort(nums);
        if (n >= 3 && nums[0] == nums[n-1]) 
        {
            if (nums[0] == 0) return Arrays.asList(Arrays.asList(0,0,0));
            else return Arrays.asList();
        }
        Set<List<Integer>> result = new HashSet<>(nums.length);
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1, k = n - 1; j < k;) 
            {
                if (nums[j] + nums[k] == (-1)*nums[i]) 
                {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    Collections.sort(temp);
                    result.add(temp);
                    if (nums[j] < nums[k]) k--; else j++;
                }
                if (nums[j] + nums[k] > -1*nums[i]) k--;
                if (nums[j] + nums[k] < -1*nums[i]) j++;
            }
        }
        List<List<Integer>> ans = new ArrayList<>(result.size());
        ans.addAll(result);
        return ans;
    }
}



// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
