class Solution {
    public List<Integer> getRow(int rowIndex) {
        long ans=1;
        int row=rowIndex+1;
        List<Integer> ansrow=new ArrayList<>();
        ansrow.add(1);
        for(int col=1;col<row;col++){
            ans*=(row-col);
            ans/=col;
            ansrow.add((int) ans);
        }
        return ansrow;
    }
}