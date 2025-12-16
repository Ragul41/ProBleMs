class Solution {
    public int maximumWealth(int[][] accounts) {
        int l1=accounts.length;
        int l2=accounts[0].length;
        int max=0;
       
        for(int i=0;i<l1;i++){
            int sum=0;
            for(int j=0;j<l2;j++){
                sum=sum+accounts[i][j];
            }
            if(sum>max)
            max=sum;
        }
        return max;
    }
}
