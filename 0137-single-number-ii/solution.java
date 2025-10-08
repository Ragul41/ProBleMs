class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int nu=0,count=0;
        if(n==1){
            return nums[0];
        }
        else{

        
        for(int i=0;i<n;i++){
            count=0;

          for(int j=1;j<n;j++){
            if(nums[i]==nums[j]){
                count++;
            }
            
          }
          if(count==1){
            nu=nums[i];
          }
          

        }
        }
        return nu;
    }
}
