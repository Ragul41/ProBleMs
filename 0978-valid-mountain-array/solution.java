class Solution {
    public boolean validMountainArray(int[] arr) {
       int n=arr.length;
       int i=0;
       if(n<3){
        return false;
       }
       while(i+1<n && arr[i]<arr[i+1]){
        i++;
       } 
       if(i+1==n || i==0){
        return false;
       }
       while(i+1<n && arr[i]>arr[i+1]){
        i++;
       }
       return i==n-1;

    }
}
