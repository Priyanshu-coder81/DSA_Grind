class Solution {
    public int maxFrequency(int[] nums, int k) {
       int n = nums.length;
       Arrays.sort(nums);

       int j = 0; 
       int ans = 0;

       long curr = 0;

       for(int i = 0; i<n; i++) {
            long target = nums[i];
            curr += target;

            while((i-j+1)*target - curr >k) {
                curr-=nums[j];
                j++;
            }
            ans = Math.max(ans,i-j+1);
       }
       return ans;
    }
}