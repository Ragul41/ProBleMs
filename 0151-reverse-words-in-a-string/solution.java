class Solution {
    public String reverseWords(String s) {
        String st=s.trim();
        String []arr=st.split("\\s+");
        int l=arr.length;
        String str="";
        for(int i=l-1;i>=0;i--){
            str=str+arr[i];
            str=str+" ";
        }
        str=str.trim();
        return str;
    }
}
