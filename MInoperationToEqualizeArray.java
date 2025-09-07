class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int target = nums[0];
        for(int i = 1; i<n; i++) {
            target = target & nums[i];
        }
        boolean flag = true;

        for(int i : nums) {
            if(i != target) {
                flag = false;
                break;
            }
        }
        if(flag) return 0;

        return 1;
    }
}