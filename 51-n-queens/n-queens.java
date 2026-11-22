class Solution {
    private void recurseNQueens(int col,char[][] board,List<List<String>> ans,int n,int[] leftRow,int[] upper,int[]lower){
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
            if(leftRow[row]==0 && upper[row+col]==0 && lower[(n-1)+(row-col)]==0){
                board[row][col]='Q';
                leftRow[row]=1;
                upper[row+col]=1;
                lower[(n-1)+(row-col)]=1;
                recurseNQueens(col+1,board,ans,n,leftRow,upper,lower);
                 board[row][col]='.';
                leftRow[row]=0;
                upper[row+col]=0;
                lower[(n-1)+(row-col)]=0;
            }
            
        }

    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        int[] leftRow=new int[n];
        Arrays.fill(leftRow,0);
        int[] upperDiagonal=new int[2*n-1];
        Arrays.fill(upperDiagonal,0);
        int[] lowerDiagonal=new int[2*n-1];
        Arrays.fill(lowerDiagonal,0);
        recurseNQueens(0,board,ans,n,leftRow,upperDiagonal,lowerDiagonal);
        return ans;
    }
}