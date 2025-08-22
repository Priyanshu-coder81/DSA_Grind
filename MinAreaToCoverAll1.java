class Solution {
    public int minimumArea(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int rowmax = 0 , rowmin = Integer.MAX_VALUE;
        int colmax = 0 , colmin =Integer.MAX_VALUE;
        for(int i =0; i<m; i++) {
            for(int j =0; j<n; j++) {
                if(grid[i][j] == 1) {
                    rowmin= Math.min(rowmin,i);
                    colmin = Math.min(colmin , j);
                    rowmax = Math.max(rowmax,i);
                    colmax = Math.max(colmax,j);
                }
            }
        }
        return (rowmax-rowmin+1)*(colmax-colmin+1);
    }
}