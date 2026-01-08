class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        for(int len=1;len<=n/2;len++){
         if(n%len==0){
            String s1=s.substring(0,len);
            StringBuilder st=new StringBuilder();
            
            int rtime=n/len;
            for(int i=0;i<rtime;i++){
                st.append(s1);
            }
            if(st.toString().equals(s)){
                return true;
            }
             
         }
        }
        return false;
    }
}
