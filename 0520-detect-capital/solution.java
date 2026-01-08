class Solution {
    public boolean detectCapitalUse(String word) {
        String s1=word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
        String s2=word.toUpperCase();
        String s3=word.toLowerCase();
        if(word.equals(s1)||word.equals(s2)||word.equals(s3)){
            return true;
        }
    
        else if(word.length()==1){
            return true;
        }
        else{
            return false;
        }
    }
}
