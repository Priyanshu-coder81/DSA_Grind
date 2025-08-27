class Solution {
    private int direction[][]  = {{1,1},{1,-1},{-1,-1},{-1,1}};
    private int memo[][][][];
    private int m , n;
    public int solve(int[][]grid,int i, int j, int d, int canTurn, int target){
        int row = i+direction[d][0];
        int col = j+direction[d][1];

        if(!(row>=0 && row<m && col>=0 && col<n) || grid[row][col] != target ) {
            return 0;
        }

        if(memo[row][col][d][canTurn] != -1) {
            return memo[row][col][d][canTurn]; 
        }

        int keepMoving = 1+solve(grid,row,col,d,canTurn,2-target);
         int maxlen =0;
        maxlen = Math.max(maxlen,keepMoving);
        if(canTurn==1) {
            maxlen = Math.max(maxlen,1+solve(grid,row,col,(d+1)%4,0,2-target));
        }
        memo[row][col][d][canTurn] = maxlen;
        return maxlen;
    }
    public int lenOfVDiagonal(int[][] grid) {
        int ans = 0;
        this.m = grid.length;
        this.n = grid[0].length;
          this.memo = new int[m][n][4][2];

        for(int i = 0; i<m; i++) {
            for(int j = 0; j<n; j++) {
                for(int d = 0; d<4; d++) {
                    Arrays.fill(memo[i][j][d], -1);
                }
            }
        }
        for(int i = 0; i<m; i++) {
            for(int j = 0; j<n; j++) {
                if(grid[i][j] == 1) {
                    for(int d = 0; d<4; d++) {
                        ans = Math.max(ans,(solve(grid,i,j,d,1,2)+1));
                    }
                }
            }
        }
        return ans;
    }
}