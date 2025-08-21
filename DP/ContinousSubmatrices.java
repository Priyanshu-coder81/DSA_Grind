class Solution {
    public int numSubmat(int[][] mat) {
        int n = mat[0].length;

        int  height[] = new int[n];

        int res = 0;

        for(int[] row : mat) {
        for(int i = 0; i<n; i++) {
            height[i] = row[i] == 0 ? 0 : height[i]+1;
        }

        Stack<int[]> st = new Stack<>();
        st.push(new int[]{-1,0,-1});

        for(int i = 0; i<n; i++) {
            int h =height[i];
            while(st.peek()[2] >= h) {
                st.pop();
            }
            int[] top = st.peek();
            int j = top[0];
            int prev = top[1];
            int cur = prev + (i-j) * h;
            st.push(new int[]{i,cur,h});
            res +=cur;
        }
    }
    return res;
}
}