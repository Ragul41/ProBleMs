class Solution {
    public int maxRepeating(String sequence, String word) {
        int l1=sequence.length();
        int l2=word.length();
        int count=0;
        String temp=word;
        for(int i=0;i<=l1-l2;i++){
            if(sequence.contains(temp)){
                count++;
                temp=temp+word;
            }
            else{
                return count;
              }
        }
       return count;
        
    }
}
