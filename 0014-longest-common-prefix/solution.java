import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {
      int l=strs.length;
      String s=strs[0];
      //String s1="";
    for(int i=1;i<l;i++){
        String s1="";
        String s2=strs[i];
        int l1=s.length();
        int l2=s2.length();
        int l3=Math.min(l1,l2);
        // if(l1<l2){
        //     l3=l1;
        // }
        // else{
        //     l3=l2;
        // }

        for(int j=0;j<l3;j++){
           if(s.charAt(j)==s2.charAt(j)){
             s1=s1+s.charAt(j);
           }
           else{
            break;
           }
           
        }
        s=s1;
        
      }
      return s;
    }
}

