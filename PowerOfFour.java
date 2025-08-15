class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0) return false;

        int rem = 0;
        while(n>=4 && rem == 0) {
            rem = n%4;
            n/=4;
        }

        if(rem != 0) return false;

        return (n!=1)?false:true;
    }
}