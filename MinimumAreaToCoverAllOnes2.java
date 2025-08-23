class Solution {
    public int minsum(int[][]grid , int u, int d, int l , int r) {
        int row_max = 0, row_min = grid.length-1;
        int col_max = 0 , col_min = grid[0].length-1;

        for(int i = u; i<=d; i++) {
            for(int j = l; j<=r; j++) {
                if(grid[i][j] == 1) {
                    row_min = Math.min(row_min,i);
                    row_max = Math.max(row_max,i);
                    col_min = Math.min(col_min, j);
                    col_max = Math.max(col_max,j);
                }
            }
            
        }
        return (row_max>=row_min)? (row_max-row_min+1)*(col_max-col_min+1): Integer.MAX_VALUE/3;
    }
    public int[][] rotate(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ret[][] = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ret[n - j - 1][i] = grid[i][j];
            }
        }
        return ret;
    }

    public int solve(int [][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int res = m*n;

        for(int i = 0; i<m-1; i++) {
            for(int j = 0; j<n-1; j++) {
                
                // 1. Horizontal spilt top and then  vertical split bottom
                res = Math.min(res,
                minsum(grid,0,i,0,n-1)+
                minsum(grid,i+1,m-1,0,j)+
                minsum(grid,i+1,m-1,j+1,n-1)
                );

               // 2. Vertical split top and then  horizontal bottom

               res = Math.min(res , 
              minsum(grid,0,i,0,j)+
              minsum(grid,0,i,j+1,n-1)+
              minsum(grid,i+1,m-1,0,n-1)
              );
            }
        }
        // All horizontal splits
        for(int i = 0; i<m-2; i++) {
            for(int j = i+1; j<m-1; j++) {
                res = Math.min(res,
                minsum(grid,0,i,0,n-1)+
                minsum(grid,i+1,j,0,n-1)+
                minsum(grid,j+1,m-1,0,n-1)
                );
            }
        }
        return res;
    }

    public int minimumSum(int[][] grid) {
        int rigid[][] = rotate(grid);

        return Math.min(solve(grid), solve(rigid));
    }
}