class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String str="";
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='0'&&s.charAt(i)<='9')){
             str=str+s.charAt(i);
            }
        }
        int n2=str.length()-1;
        int n1=0;
        while(n1<n2){
            if(str.charAt(n1)!=(str.charAt(n2))){
                return false;
            }
            n1++;
            n2--;

        }
        return true;



    }
}
