class Solution {
    public int subarray(int[] nums, int k) {
        int n = nums.length;
        int l = 0 , r= 0;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int cnt = 0;
        while(r<n) {
            int right = nums[r];
            hmap.put(right,hmap.getOrDefault(right,0)+1);

            while(hmap.size()>k){
                int left = nums[l];
                hmap.put(left,hmap.get(left)-1);
                l++;

                if(hmap.get(left) == 0) hmap.remove(left);
            }
            cnt += r-l+1;
            r++;
        }

        return cnt;

    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        
        return subarray(nums , k) - subarray(nums,k-1);
    }
}