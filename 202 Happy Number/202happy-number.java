class Solution {
    private int sumsquares(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit*digit;
            n/=10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow=n,fast=n;
        do{
            slow=sumsquares(slow);
            fast=sumsquares(sumsquares(fast));
        }while (slow!=fast);
        return slow==1;

    }
}