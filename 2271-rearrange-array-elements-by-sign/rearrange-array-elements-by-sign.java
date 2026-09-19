class Solution {
    public int[] rearrangeArray(int[] nums) {
       int posIndex=0;
       int negIndex=1;
       int n=nums.length;
       int[] temp=new int[n];
       for(int i=0;i<n;i++){
        if(nums[i]<0){  //add negative elements at odd indices
            temp[negIndex]=nums[i];
            negIndex+=2;
        }
        else{   //add positive elements to even indices
            temp[posIndex]=nums[i];
            posIndex+=2;
        }
       }
       return temp;
    }
}