class Solution {
    public int reverse(int n) {
        int s = 0;
        while(n != 0) {
            int r = n%10;

            if(s>Integer.MAX_VALUE/10 ) return 0;

            if(s<Integer.MIN_VALUE/10 ) return 0;

            s = s*10+r;
            n=n/10;
        }

        return s;
    }
}