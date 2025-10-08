class Solution {
    public int searchInsert(int[] nums, int target) {
       int n=nums.length;
       int in=0;
       for(int i=0;i<n;i++){
        if(nums[i]==target){
           return in=i;
        }
        else if(nums[i]>target){
            return in=i;
        }
        if(target>nums[n-1]){
            return n;
        }
        

       } 
       return in;
    }
}
