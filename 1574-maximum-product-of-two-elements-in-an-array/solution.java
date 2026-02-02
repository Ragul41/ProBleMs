class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        int wind=0;
        
        for(int i=0;i<nums.length-1;i++){
            wind=(nums[i]-1)*(nums[i+1]-1);
            max=Math.max(wind,max);
        }
        return max;
        
    }
}
