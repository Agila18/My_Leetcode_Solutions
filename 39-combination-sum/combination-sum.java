class Solution {

private void generateSubset(int i,int target,int[] arr,int sum,List<Integer> ds,List<List<Integer>> ans){
    if(i==arr.length){
        if(sum==target) ans.add(new ArrayList<>(ds));
        return;
    }
     // Base case: target reached
        if (sum == target) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        // No more candidates
        if (i == arr.length) {
            return;
        }

        // Pick: reuse the same element
        if (sum + arr[i] <= target) {
            ds.add(arr[i]);
            sum += arr[i];

            generateSubset(i, target, arr, sum, ds, ans);

            // Backtracking
            ds.remove(ds.size() - 1);
            sum -= arr[i];
        }

        // Not pick: move to next element
        generateSubset(i + 1, target, arr, sum, ds, ans);
} 
public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ds=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        generateSubset(0,target,candidates,0,ds,ans);
        return ans;
    }
}