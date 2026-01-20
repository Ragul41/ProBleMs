class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1){
            return s;
        }
       int maxlen=1;
       String str=s.substring(0,1);
       for(int i=0;i<s.length();i++){
        for(int j=i+maxlen;j<=s.length();j++){
            if(j-i>maxlen && ispalindrome(s.substring(i,j))){
                maxlen=j-i;
                str=s.substring(i,j);
            }
        }
       }
       return str;


    }
    private boolean ispalindrome(String s1){
        int left=0;
        int right=s1.length()-1;
        while(left<right){
            if(s1.charAt(left)!=s1.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}

