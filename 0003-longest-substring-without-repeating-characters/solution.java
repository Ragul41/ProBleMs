class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int max=0;
        int start=0;
        // String s2="";
        
        // if(!s.isEmpty()&&s.isBlank()||n==1){
        //     return 1;
        // }
        // //Stringbuilder s=new Stringbuilder();
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //       char c=s.charAt(j);
        //       if(s2.indexOf(c)==-1){
        //         s2=s2+c;
        //       }
        //       else{
        //         // int l2=s2.length();
        //         // if(l2>max){
        //         //     max=l2;
        //         // }
        //         max=Math.max(max,s2.length());
        //         s2="";
        //         break;
        //       }
        //     }
            
        // } 
        Set<Character> set=new HashSet<>();
        for(int i=0;i<n;i++){
           while(set.contains(s.charAt(i))){
            set.remove(s.charAt(start));
            start++;
           }
           set.add(s.charAt(i));
           max=Math.max(max,i-start+1);
        } 

        return max;      
    }
}
