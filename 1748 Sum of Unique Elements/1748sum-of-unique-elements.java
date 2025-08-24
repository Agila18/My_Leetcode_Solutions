class Solution {
    public int sumOfUnique(int[] nums) {
        int[] arr=new int[101];
        int sum=0;
        for(int num:nums){
            arr[num]++;
            if(arr[num]==1){
                sum+=num;
            }
            else if(arr[num]==2){
                sum-=num;
            }
        }
        return sum;
    }
}