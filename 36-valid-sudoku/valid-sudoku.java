class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] row=new boolean[9][9];
        boolean[][] col=new boolean[9][9];
        boolean[][] box=new boolean[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')    continue;
                int index=board[i][j]-'1';
                int k=(i/3)*3+j/3;
                if(row[i][index] || col[j][index] || box[k][index]){
                    return false;
                }
                row[i][index]=true;
                col[j][index]=true;
                box[k][index]=true;
            }
        }
        return true;
    }
}