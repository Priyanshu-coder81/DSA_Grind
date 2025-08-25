class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int d = 1;

        int size = m*n;

        int res[] = new int[size];

        int row = 0 , col = 0;
        int k = 0;
        int newRow = 0 , newCol = 0;

        while(row<m && col <n) {

            res[k++] = mat[row][col];


             newRow = row +(d==1?-1:1);
             newCol = col + (d==1? 1:-1);


            if(newRow < 0 || newRow == m || newCol < 0 || newCol == n) {

                if(d==1) {
                    row += (col == n-1? 1:0);
                    col += (col<n-1?1:0);
                }
                else {
                    col += (row == m-1?1:0);
                    row += (row < m-1?1:0);
                }
                d = 1-d;
            }
            else {
                row = newRow;
                col = newCol;
            }
        }
        return res;
    }
}