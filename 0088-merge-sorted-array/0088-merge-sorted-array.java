class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int j=m;
        for(int i=0;i<n;i++)
        {
            nums1[j]=nums2[i];
            j++;
        }
        Arrays.sort(nums1);
    }
}