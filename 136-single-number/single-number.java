class Solution {
    public int singleNumber(int[] nums) {
        for(int i=0;i<=nums.length-1;i++){
            int val=nums[i];
            int count=0;
            for(int j=0;j<=nums.length-1;j++){
                if(nums[j]==val)    count++;
            }
            if(count==1)    return val;
        }
        return -1;
    }
    
}