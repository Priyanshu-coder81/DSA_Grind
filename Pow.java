class Solution {
    public double helper(double x , long n) {
        double ans = 1;
        while(n>0) {
            if((n&1) == 1) {
                ans *=x;
            }
            x=x*x;
            n=n>>1;
        }
        return ans;
    }
    public double myPow(double x, int n) {
        if(n == 0 || x == 1) return 1;
        
        long exp = n;

        if(exp<0) {
            exp=-exp;
            return 1/helper(x,exp);
        }

        return helper(x,exp);

    }
}