class Solution {
    public int[] countBits(int n) {
        int[] count=new int[n+1];
        for(int i=0;i<=n;i++){
            count[i]= nobits(i);
        }
        return count;
    
    }
    private int nobits(int n){
        int count=0;
        while(n>0){
            count+=n%2;
            n/=2;
        }
        return count;
    }
}