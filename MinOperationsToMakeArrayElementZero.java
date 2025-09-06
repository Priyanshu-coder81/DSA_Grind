class Solution {
    public long solve(int l ,int r) {
        long L = 1;
        long pow = 1;
        long steps = 0;

        while(L<=r) {
            long R = 4*L-1;
            long start = Math.max(L,l);
            long end = Math.min(r,R);

            if(start<=end) {
                steps += (end-start+1)*pow;
            }
            pow++;
            L*=4;
        }
        return steps;
    }
    public long minOperations(int[][] queries) {
        long ans = 0;
        for(int q[] : queries) {
            int l = q[0];
            int r = q[1];

            ans += (solve(l,r)+1)/2;
        }
        return ans;
    }
}