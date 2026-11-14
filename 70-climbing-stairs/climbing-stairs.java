class Solution {
    static int recurse(int index, int[] dp){
        for(int i=2;i<=index;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[index];
    }
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=1;
        dp[1]=1;
        return recurse(n,dp);
    }
}