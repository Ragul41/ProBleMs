class Solution {
    public String convertToTitle(int columnNumber) {
        int n=columnNumber;
       StringBuilder sb=new StringBuilder();
        
        while(n>0){
           n=n-1;
           int rem=n%26;
           char c=(char)('A'+rem);
           sb.append(c);
           n=n/26;
        }
        return sb.reverse().toString();
    }
}
