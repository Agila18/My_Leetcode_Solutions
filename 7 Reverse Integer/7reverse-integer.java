class Solution {
    public int reverse(int x) {
        int sign;
        if(x<0){
            sign=-1;
        } 
        else{
            sign=1;
        }   
        long rev=0;
        long n=Math.abs((long)x);
        if(n<10) return x;
        while(n>0){
            rev=rev*10+n%10;
            n/=10;
            if(rev< Math.pow(-2,31) || rev>Math.pow(2,31)-1){
            return 0;
        }
        }
        rev*=sign;
        
        return (int)rev;
    }
}