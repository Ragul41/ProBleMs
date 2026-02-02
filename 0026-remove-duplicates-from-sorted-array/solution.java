class Solution {
    public int removeDuplicates(int[] nums) {
     if(nums.length==0)return 0;
     int n1=0;
     for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[n1]){
            n1++;
            nums[n1]=nums[i];  
            //n1++;
        }
     }
     return n1+1;


        
    }
}
