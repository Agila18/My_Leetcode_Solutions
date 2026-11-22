class Solution {
    boolean isSafe(int col,int row,char[][] board,int n){
        //Check Upper diagonal
        int duprow=row;
        int dupcol=col;
        while(row>=0 && col>=0){
            if(board[row][col]=='Q'){
                return false;
            }
            row--;
            col--;
        }
        //Check leftwards
        row=duprow;
        col=dupcol;
        while(col>=0){
            if(board[row][col]=='Q'){
                return false;
            }
            col--;
        }
        //Check Lower diagonal
        row=duprow;
        col=dupcol;
        while(row<n && col>=0){
            if(board[row][col]=='Q'){
                return false;
            }
            row++;
            col--;
        }
        return true;
    }
    private void recurseNQueens(int col,char[][] board,List<List<String>> ans,int n){
        if(col==n){
            List<String> ds=new ArrayList<>();
            for(int i=0;i<board.length;i++){
                String s=new String(board[i]);
                ds.add(s);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int row=0;row<n;row++){
            if(isSafe(col,row,board,n)){
                board[row][col]='Q';
                recurseNQueens(col+1,board,ans,n);
                board[row][col]='.';
            }
        }

    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        recurseNQueens(0,board,ans,n);
        return ans;
    }
}