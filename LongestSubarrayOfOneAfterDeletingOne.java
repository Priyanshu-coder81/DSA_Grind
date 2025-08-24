class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        int lastOne = 0;
        int max = -1;
        boolean flag = false;
        for(int i = 0; i<n; i++) {
            int a = nums[i];

            if(a == 1) {
                cnt++;
            }
            else {
                lastOne = cnt;
                cnt= 0;
                flag = true;
                continue;
            }
           max = Math.max(max,lastOne + cnt);
        }
        if(!flag) {
            return max-1;
        }
        if(max == -1) {
            return 0;
        }
        return max;
    }
}