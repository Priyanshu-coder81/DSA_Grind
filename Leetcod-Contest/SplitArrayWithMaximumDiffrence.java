class Solution {
    public long splitArray(int[] nums) {
        int n = nums.length;
        long prefix[] = new long[n];

        prefix[0] = nums[0];
        for(int i = 1; i<n; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }

        boolean inc[] = new boolean[n];
        inc[0] = true;
        for(int i = 1; i<n; i++) {
            if(nums[i] > nums[i-1] && inc[i-1]) {
                inc[i] = true;
            }
        }

        boolean dec[] = new boolean[n];
        dec[n-1] = true;
        for(int j = n-2; j>=0; j--) {
            if(nums[j] > nums[j+1] && dec[j+1]) 
                dec[j] = true;
        }
        long min = Long.MAX_VALUE;
        boolean found = false;
        long sum = prefix[n-1];

        for(int i = 0; i<n-1; i++) {
            if(inc[i] && dec[i+1]) {
                long ans = Math.abs(prefix[i] - (sum-prefix[i]));
                min = Math.min(min,ans);
                found = true;
            }
        }
        return found? min : -1;
    }
}