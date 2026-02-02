class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windsum=0;
        int start=0;
        int max=Integer.MIN_VALUE;
        for(int end=0;end<nums.length;end++){
            windsum+=nums[end];
            if(end-start+1==k){
               max=Math.max(max,windsum);
               windsum-=nums[start];
               start++;
            }
        }
        double a=(double)k;
        return max/a;

        
    }
}
