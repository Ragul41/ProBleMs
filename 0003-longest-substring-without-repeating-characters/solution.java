class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        String s2="";
        int max=0;
        if(!s.isEmpty()&&s.isBlank()||n==1){
            return 1;
        }
        //Stringbuilder s=new Stringbuilder();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
              char c=s.charAt(j);
              if(s2.indexOf(c)==-1){
                s2=s2+c;
              }
              else{
                // int l2=s2.length();
                // if(l2>max){
                //     max=l2;
                // }
                max=Math.max(max,s2.length());
                s2="";
                break;
              }
            }
            
        }  
        return max;      
    }
}
