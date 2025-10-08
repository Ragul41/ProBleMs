class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int n=nums.length;
        for(int j=0;j<n;j++){
         if(nums[i]!=nums[j]){
            i++;
            nums[i]=nums[j];
         }
        }
        System.out.print("[");
        for(int k=0;k<i+1;k++){
            System.out.println(nums[k]);
            if(k<i){
                System.out.print(",");
            }
        }
        System.out.print("]");

        
        
        
     
        return i+1;


        
    }
}
