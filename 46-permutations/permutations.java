class Solution {
    //APPROACH-2: Swapping instead of an extra map array
    private void swap(int[] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    private void recursePermute(int index,int[] arr,List<List<Integer>> ans){
        if(index==arr.length){
            //Copy array to an other ds to avoid object references issues in future
            List<Integer> ds=new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                ds.add(arr[i]);
            }
            ans.add(ds);
            return;
        }
        for(int i=index;i<arr.length;i++){
            //Swap for recursion
           if(index!= i) swap(arr,i,index);
            recursePermute(index+1,arr,ans);
            //re-Swap for Backtracking
            if(index!=i) swap(arr,i,index);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        recursePermute(0,nums,ans);
        return ans;
        
    }
}