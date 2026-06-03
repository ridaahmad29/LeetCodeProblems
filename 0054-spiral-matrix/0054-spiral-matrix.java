class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length ; 
        int n= matrix[0].length;

        List<Integer> list = new ArrayList<>();

        int s_row = 0;
        int e_row = m-1;
        int s_col = 0;
        int e_col= n-1;

        while(s_row <= e_row && s_col <= e_col){

        for(int j= s_col ; j<=e_col ; j ++ ){
            list.add(matrix[s_row][j]);
        }
        for(int i = s_row+1 ; i<=e_row ; i ++){
            list.add(matrix[i][e_col]);
        }
        if(s_row < e_row){
            for(int j=e_col-1 ; j >=s_col ; j--){
              list.add(matrix[e_row][j]);
            }
        }
        if(s_col < e_col){
            for(int i = e_row - 1 ; i >= s_row+1 ; i --){
                list.add(matrix[i][s_col]);
            }
        }
        s_row++;  e_row--;
        s_col++;  e_col--;

        }

        return list ; 
    }
}