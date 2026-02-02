class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        int []arr=new int[2];
        while(left<right){
            int t=numbers[left]+numbers[right];
            if(t==target){
                arr[0]=left+1;
                arr[1]=right+1;
                break;
            }
            else if(t<target){
                left++;
            }
            else if(t>target){
                 right--;
            }
        }
        return arr;
    }
}
