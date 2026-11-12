class Solution {
    public List<Integer> generateRow(int row){
        int ans=1;
        List<Integer> ansRow=new ArrayList<>();
        ansRow.add(ans);
        for(int col=1;col<row;col++){
            ans*=(row-col);
            ans/=col;
            ansRow.add(ans);
        }
        return ansRow;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
             pascal.add(generateRow(i));
        }
        return pascal; 

    }
}