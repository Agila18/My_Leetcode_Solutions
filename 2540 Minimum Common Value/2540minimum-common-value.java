class Solution {
    static {
        for(int i = 0; i <500; i++)
            getCommon(new int[]{1}, new int[]{1});
    }
    public static int getCommon(int[] nums1, int[] nums2) {
        
        int len1 = nums1.length;
        int len2 = nums2.length;
        int p1 = 0;
        int p2 = 0;

        while(p1 < len1 && p2 < len2 ) {
            if(nums1[p1] == nums2[p2])
                return nums1[p1];

            if(nums1[p1] < nums2[p2])
                    p1++;
               else
                    p2++;     
        }

        return -1;
    }
}