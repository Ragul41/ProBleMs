class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int actual=n*(n+1)/2;
        int fake=0;
        for(int i:nums){
            fake=fake+i;   
        }
        return actual-fake;
    }
}
