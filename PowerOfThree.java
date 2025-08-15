class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        int rem = 0;

        while(rem == 0 && n>=3) {
            rem = n%3;
            n=n/3;
        }

       if(rem != 0) return false;

       return (n==1)? true:false;
    }
}