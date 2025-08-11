class Solution {
    public void solve(int[] nums, List<List<Integer>> ans , int idx) {

        if(idx == nums.length) {
            List<Integer> d = new ArrayList<>();
            for(int i  = 0; i<nums.length; i++) {
                d.add(nums[i]);
            }
            ans.add(d);
        }

        for(int i = idx; i<nums.length; i++) {
            swap(i,idx,nums);
            solve(nums,ans,idx+1);
            swap(i,idx,nums);
        }
    }
    public void swap(int i , int j , int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;

        List<List<Integer>> ans = new ArrayList<>();

        solve(nums,ans,0);

        return ans;
    }
}