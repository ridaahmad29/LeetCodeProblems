class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i =0;i< 9;i++){
            HashMap<Character,Integer> map = new HashMap<>();
            for(int j = 0;j<9;j++){
                if(board[i][j]=='.') continue;
                if(!map.containsKey(board[i][j])){
                    map.put(board[i][j],1);
                }
                else return false;
            }
        }
        for(int j = 0;j<9;j++){
            HashMap<Character,Integer> map = new HashMap<>();
            for(int i =0;i< 9;i++){
                if(board[i][j]=='.') continue;
                if(!map.containsKey(board[i][j])){
                    map.put(board[i][j],1);
                }
                else return false;
            }
        }
        for(int r=0; r<9 ;r=r+3){
            for(int c=0;c<9;c=c+3){
                HashMap<Character,Integer> map = new HashMap<>();

                for(int i =r;i<r+3 ;i++){
                    for(int j =c;j<c+3;j++){
                        if(board[i][j]=='.') continue;
                        if(!map.containsKey(board[i][j])){
                            map.put(board[i][j],1);
                        }
                        else return false;
                    }
                }
            }
        }
        return true;
    }
}