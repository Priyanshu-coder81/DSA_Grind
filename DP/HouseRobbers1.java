class Solution {
    public int solve(int []nums, int idx,int []dp) {

        if(idx < 0 ) return 0;
        if(idx == 0) return nums[0];

        if(dp[idx] != -1) return dp[idx];

        int pick = nums[idx] + solve(nums,idx-2, dp);
        int notpick = 0 + solve(nums,idx-1, dp);

        return dp[idx] = Math.max(pick,notpick);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(nums,n-1,dp);
    }
}