class Solution {
    public boolean isTrionic(int[] nums) {
        int n=nums.length;
        if(n<4){
            return false;
        }
        int i=0;
        while(i+1<n&&nums[i]<nums[i+1]){
            i++;
        }
        if(i+1==n||i==0){
            return false;
        }
        while(i+1<n&&nums[i]>nums[i+1]){
            i++;
        }
        if(i+1==n||i==0){
            return false;
        }
        while(i+1<n&&nums[i]<nums[i+1]){
            i++;
        }
        
        return i==n-1;

    }
}
