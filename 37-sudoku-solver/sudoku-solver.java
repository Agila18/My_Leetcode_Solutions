class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    private boolean solve(char [][] board){
        //Traverse matrix
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                // Find empty cell
                if(board[i][j]=='.'){
                    //Try all(1 to 9 digits)
                    for(char c='1';c<='9';c++){
                        //Check if its valid
                        if(isValid(board,i,j,c)){
                            //Pick the number
                            board[i][j]=c;
                            //recurse-from next empty
                            if(solve(board))    return true;
                            //Backtrack 
                            else    board[i][j]='.';
                        }
                    }
                    return false;


                }
            }
        }
        return true;
        }
        private boolean isValid(char[][] board,int row,int col,char c){
            for(int i=0;i<9;i++){
                //Check row
                if(board[row][i]==c)    return false;
                //check column
                if(board[i][col]==c)    return false;
                //check 3x3 sub-matrix
                if(board[3*(row/3)+i/3][3*(col/3)+i%3]==c)  return false;

            }
            return true;
        }
    
}