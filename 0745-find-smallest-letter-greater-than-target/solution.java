class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
  
     if(target<letters[0]||target>letters[letters.length-1]||target==letters[letters.length-1]){
        return letters[0];
     }
     else{
        int i=0;
        while(target>=letters[i]){
            i++;
        }
        return letters[i];
     }
    
    }
}
