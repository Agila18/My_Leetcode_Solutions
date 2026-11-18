class Solution {
    private void findCombinations(int i,int target,int[] arr,List<Integer> ds,List<List<Integer>> ans){
        if(i==arr.length){
            if(target==0)   ans.add(new ArrayList<>(ds));
            return;
        }
        //Pick
        if(arr[i]<=target){
            ds.add(arr[i]);
            findCombinations(i,target-arr[i],arr,ds,ans);
            ds.remove(ds.size()-1);
        }
        findCombinations(i+1,target,arr,ds,ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        findCombinations(0,target,candidates,new ArrayList<>(),ans);
        return ans;
    }
}