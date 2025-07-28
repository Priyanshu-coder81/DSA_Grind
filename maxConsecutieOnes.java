// LEETCODE -> 1004
class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int max = 0;
        int left = 0; int right = 0;

        while(right < n) {

            if(nums[right] == 1) {
                right++;
                max = Math.max(max,right-left);
            }
            else if(nums[right] == 0 && k > 0) {
                right++;
                max = Math.max(max,right-left);
                k--;
            }
            else if(nums[right] == 0 && k == 0) {
                if(nums[left] == 0) k++;
                left++;
            }
        }
        return max;
    }
}