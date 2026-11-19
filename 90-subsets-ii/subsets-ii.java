class Solution {
    private void findCombination(int index,int[] arr,List<Integer> ds, List<List<Integer>> ans){
        ans.add(new ArrayList<>(ds));
        for(int i=index;i<arr.length;i++){
            if(i!=index && arr[i]==arr[i-1])  continue;
            ds.add(arr[i]);
            findCombination(i+1,arr,ds,ans);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        findCombination(0,nums,new ArrayList<>(),ans);
        return ans;
    }
}