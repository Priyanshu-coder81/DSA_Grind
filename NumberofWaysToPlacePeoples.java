class Solution {
    public int numberOfPairs(int[][] points) {
        int n = points.length;

        Arrays.sort(points,(a,b)-> {
            if(a[0] != b[0]) {
                return Integer.compare(a[0],b[0]);
            }
            return Integer.compare(b[1],a[1]);
        });

        int cnt = 0;

        for(int i = 0; i<n-1; i++) {
            int lastpoint = Integer.MIN_VALUE;
            for(int j = i+1; j<n; j++) {
                if(points[i][1] >= points[j][1] && points[j][1] > lastpoint) {
                    cnt++;
                    lastpoint = points[j][1];
                }
            }
        }

        return cnt;

    }
}