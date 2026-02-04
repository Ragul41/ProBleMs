class Solution {
    public int characterReplacement(String s, int k) {
        int []freq=new int[26];
        int maxlen=0;
        int left=0;
        int  maxfreq=0;
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            freq[c-'A']++;
            maxfreq=Math.max(maxfreq,freq[c-'A']);
            int windsize=right-left+1;

            if(windsize-maxfreq>k){
               freq[s.charAt(left)-'A']--;
               left++;
            }

            maxlen=Math.max(maxlen,right-left+1);


        }
        return maxlen;

        
    }
}
