class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int count =mat.length * mat[0].length;;
        
        if(r*c != count){
            return mat;
       }
       int[][] answer = new int[r][c];
       int row = 0;
       int col = 0;
         
        for(int i = 0 ; i < r ; i ++){
            for(int j = 0 ; j < c ; j ++){
                answer[i][j]=mat[row][col];
                col++;

                if(col == mat[0].length) {
                    col = 0;
                    row++;
                }
            }
        }
        return answer;
       
    }
}