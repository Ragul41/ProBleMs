class Solution {
    public int lengthOfLastWord(String s) {
        int st=s.length()-1;
        while(s.charAt(st)==' '){
         st--;
        }
        if(st==-1){
            return 0;
        }
        int res=0;
        while(st>=0&&s.charAt(st)!=' '){
            st--;
            res++;
        }
        return res;
        

 }
}
