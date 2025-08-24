class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,pro=1;
        while(n>0){
            int digit=n%10;
            pro*=digit;
            sum+=digit;
            n/=10;
        }
        return (pro-sum);
    }
}