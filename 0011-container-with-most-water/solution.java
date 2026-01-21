class Solution {
    public int maxArea(int[] height) {
        int a=0;
        int b=height.length-1;
        int max=0;
        while(a<b){
            int n=Math.min(height[a],height[b]);
            int res=n*(b-a);
            if(res>max){
                max=res;
            }
            if(height[a]>height[b]){
                b--;
            }
            else{
                a++;
            }
        }
        return max;
    }
}
