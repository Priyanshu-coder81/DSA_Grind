class Solution {
    public List<List<Integer>> ans = new ArrayList<>();

    public void swap(int nums[],int i , int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void solve(int []nums, int idx) {
        if(idx == nums.length) {
            List<Integer> d = new ArrayList<>();
            for(int i : nums)
                d.add(i);
            ans.add(d);
        }

        HashSet<Integer> hset = new HashSet<>();
        for(int i = idx; i<nums.length;i++) {
            if(hset.contains(nums[i])) {
                continue;
            }

            swap(nums,i,idx);

            solve(nums,idx+1);

            swap(nums,i,idx);
            
            hset.add(nums[i]);
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        solve(nums,0);
        return ans;
    }
}