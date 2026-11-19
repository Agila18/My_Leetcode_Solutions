class Solution {
    private void recursePermute(List<Integer>ds,boolean[] map,int[] arr,List<List<Integer>> ans){
        if(ds.size()==arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!map[i]){
                map[i]=true;
                ds.add(arr[i]);
                recursePermute(ds,map,arr,ans);

                ds.remove(ds.size()-1);
                map[i]=false;
            }

        }

    } 
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        boolean[] map=new boolean[nums.length];
        recursePermute(new ArrayList<Integer>(),map,nums,ans);
        return ans;
    }
}