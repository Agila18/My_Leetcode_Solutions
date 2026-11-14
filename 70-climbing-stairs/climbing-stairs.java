class Solution {
    static int recurse(int index, int[] dp){
        if(index==0)    return 1;
        if(index==1)    return 1;
        if(dp[index]!=-1) return dp[index];
        return dp[index]=recurse(index-1,dp)+recurse(index-2,dp);
    }
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return recurse(n,dp);
    }
}