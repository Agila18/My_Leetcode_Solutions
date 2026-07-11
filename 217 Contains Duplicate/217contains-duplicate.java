class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int len=nums.length;
        for(int i=0;i<len;i++){
            set.add(nums[i]);
        }
        return len!=set.size();
    }
}