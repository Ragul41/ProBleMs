class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int l1=word1.length;
        int l2=word2.length;
        String s1="";
        String s2=""; 
        for(int i=0;i<l1;i++){
           s1=s1+word1[i];
        }
        for(int i=0;i<l2;i++){
           s2=s2+word2[i];
        }

        if(s1.equals(s2)){
            return true;
        }
        else{
            return false;
        }
        
    }
}
