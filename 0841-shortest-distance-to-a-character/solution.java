class Solution {
    public int[] shortestToChar(String s, char c) {
        int n=s.length();
        int count1=0,count2=0;
        
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            count1=0;
            count2=0;
            int c1=0,c2=0;
            if(s.charAt(i)==c){
                arr[i]=0;
                continue;
            }

          for(int j=i;j<n;j++){
            
             if(s.charAt(j)==c ){
                count1=j-i;
                c1=1;
                break;
                
                
             }

          }
          for(int k=i;k>=0;k--){
           if(s.charAt(k)==c){
            count2=i-k;
            c2=1;
            break;
           }

          }
        
        if(c1==1&&c2==1){
            arr[i]=Math.min(count1,count2);
        }
        else if(c1==1){
            arr[i]=count1;
        }
        else{
            arr[i]=count2;
        }
        }
        return arr;        
    }
}
