class Solution {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0,j=m;i<n;j++,i++){
            nums1[j]=nums2[i];
        }
        Arrays.sort(nums1);
        return nums1;
    }
}
