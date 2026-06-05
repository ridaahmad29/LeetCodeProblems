class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];

        int s_row = 0; 
        int e_row = n - 1;
        int s_col = 0;
        int e_col = n - 1;

        int num = 1;

        while (s_row <= e_row && s_col <= e_col) {

            for (int j = s_col; j <= e_col; j++) {
                arr[s_row][j] = num++;
            }
            s_row++;

            for (int i = s_row; i <= e_row; i++) {
                arr[i][e_col] = num++;
            }
            e_col--;

            if (s_row <= e_row) {
                for (int j = e_col; j >= s_col; j--) {
                    arr[e_row][j] = num++;
                }
                e_row--;
            }

            if (s_col <= e_col) {
                for (int i = e_row; i >= s_row; i--) {
                    arr[i][s_col] = num++;
                }
                s_col++;
            }
        }

        return arr;
    }
}