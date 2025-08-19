class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n = nums.length;
        long ans = 0;
        long prevZeros = 0;

        for(int num : nums) {
            if(num == 0) {
                ans += prevZeros+1;
                prevZeros++;
            }
            else {
                prevZeros = 0;
            }
        }
        return ans;
    }
}