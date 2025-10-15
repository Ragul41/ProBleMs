class Solution {
    public String convert(String s, int numRows) {
        int n=s.length();
        int []arr=new int[n];
        int i=0;
        String str="";
        int max=numRows;
        while(i<n){
            for(int j=1;j<=max;j++){
                if(i>=n){
                    break;
                }
                arr[i]=j;
                i++;
        }
        for(int k=max-1;k>=2;k--){
            if(i>=n){
                    break;
                    }
                    arr[i]=k;
                    i++;
        }
    
            
        }
        for(int m=1;m<=max;m++){
           for(int p=0;p<n;p++){
              if(arr[p]==m){
                str=str+s.charAt(p);
              }
           }
        }

        return str;
        
        
        
    }
}
