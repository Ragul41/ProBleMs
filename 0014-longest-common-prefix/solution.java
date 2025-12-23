import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {
      int l=strs.length;
      String s1=strs[0];
     for(int i=1;i<strs.length;i++){
        int l1=Math.min(s1.length(),strs[i].length());
        String s2="";
        
        for(int j=0;j<l1;j++){
            if(s1.charAt(j)==strs[i].charAt(j)){
                s2=s2+s1.charAt(j);
            }
            else{
                break;
            }
        }
        s1=s2;
      }
      
      return s1;
    }
}

