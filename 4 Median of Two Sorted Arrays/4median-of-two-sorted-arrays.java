class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        int[] tempor=new int[len1 + len2];
        int k=0;
        for(int i=0;i<len1;i++){
            tempor[k++]=nums1[i];
        }
        for(int j=0;j<len2;j++){
            tempor[k++]=nums2[j];
        }
        Arrays.sort(tempor);
        int len=tempor.length;
        if(len%2==0) return (double)(tempor[(len-1)/2]+ tempor[(len-1)/2 +1])/2;
        else return tempor[(len -1)/2];

    }
}