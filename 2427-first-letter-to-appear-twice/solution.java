class Solution {
    public char repeatedCharacter(String s) {
        // int []freq=new int[26];
        // int n=0;
        
        // for(int i=0;i<s.length();i++){
        //     char c=s.charAt(i);
        //     freq[c-'a']++;

        //     for(int j=0;j<s.length();j++){
        //     if(freq[s.charAt(j)-'a']==2){
        //         n=j;
                
        //     }
        // }
        // if(n!=0)
        // break;
        // }
        Set<Character> set=new HashSet<>();
        for(char c:s.toCharArray())
           if(!set.add(c))
             return c;

        return 'a';     
       
        // return s.charAt(n);

    }
}



