class Solution {
    public int[] sumZero(int n) {
       int ans[]  = new int[n];
       for(int i = 0; i<=n-2; i++) {
        ans[i] = i+1;
       }
       ans[n-1] = -1*(n*(n-1)/2);
       return ans;
    }
}