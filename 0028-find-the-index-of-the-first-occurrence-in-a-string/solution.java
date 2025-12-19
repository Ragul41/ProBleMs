class Solution {
    public int strStr(String haystack, String needle) {
        // for(int i=0;i<=haystack.length()-needle.length();i++){
        //   if(haystack.charAt(i)==needle.charAt(0)){
        //     int nu=i+1,count=1;
        //     for(int j=1;j<needle.length();j++){
        //         if(haystack.charAt(nu)==needle.charAt(j)){
        //             count++;
        //             nu++;
        //         }
        //     }
        //     if(count==needle.length()){
        //         return i;
        //     }

        //   }
        // }


        for(int i=0,j=needle.length();j<=haystack.length();j++,i++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
