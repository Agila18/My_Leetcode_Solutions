class Solution {
    private void findCombination(int index,int target, int[] arr, List<Integer> ds, List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index;i<arr.length;i++){
            if(i>index && arr[i]==arr[i-1]) continue;
            if(target<arr[i])   break;

            ds.add(arr[i]);
            findCombination(i+1,target-arr[i],arr,ds,ans);
            ds.remove(ds.size()-1);
        }

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        findCombination(0,target,candidates,new ArrayList<>(),ans);
        return ans;
    }
}