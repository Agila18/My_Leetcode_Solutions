class Solution {
     private void reverseArray(int[] nums,int st,int end){
        while(st<end){
            swapValues(nums,st++,end--);
        }
    }
    private void swapValues(int[] nums,int ind1,int ind2){
        int temp=nums[ind1];
        nums[ind1]=nums[ind2];
        nums[ind2]=temp;
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int index=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
               reverseArray(nums,0,n-1);
               return;
        }
        for(int i=n-1;i>index;i--){
            if(nums[i]>nums[index]){
                swapValues(nums,i,index);
                break;
            }

        }
        reverseArray(nums,index+1,n-1);
    }
   
}