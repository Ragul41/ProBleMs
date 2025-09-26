class Solution {
    public int maxAscendingSum(int[] nums) {
        int n=nums.length;
        int max=0;
        int sum=nums[0];
        int nu=0;
         if(n==1){
            return sum;
        }
        for(int i=1;i<n;i++){
       
        if(nums[i]>nums[i-1]){
            sum+=nums[i];
            nu=sum;
        }
        else{
            nu=sum;
            sum=nums[i];
        }
        if(nu>max){
                max=nu;
            }
        }
        return max;
    }
}
