class Solution {
    public int solve(int []val , int i , int j, int [][]dp) {
        if(j-i < 2) {
            return 0;
        }
        if(dp[i][j] != -1) return dp[i][j];
        int res = Integer.MAX_VALUE;
        for(int k = i+1; k<j; k++) {
            int wt = val[i]*val[j]*val[k] + solve(val,i,k,dp) + solve(val,k,j,dp);

            res = Math.min(res,wt);
        }

        return dp[i][j] = res;
    }
    public int minScoreTriangulation(int[] val) {
        int dp[][] = new int[51][51];
       for(int i = 0; i<51; i++) {
        for(int j = 0; j<51; j++) 
            dp[i][j] = -1;
       }
       return solve(val,0,val.length-1,dp);
    }
}