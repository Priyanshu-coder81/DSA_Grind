class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;

        for(int n : nums) {
            xor ^= n;
        }

        int b = (xor&(xor-1)) ^xor;

        int x = 0 , y= 0;
        for(int n : nums) {
            if((b&n) != 0) {
                x ^=n;
            }
            else {
                y^=n;
            }
        }
        return new int[]{x,y};
    }
}