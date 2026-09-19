class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxi=0;
        for(int num:nums){
            if(num==1)  count++;
            if(num==0)  count=0;
            maxi=Math.max(maxi,count);
        }
        return maxi;
    }
}