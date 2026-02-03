class Solution {
    public boolean backspaceCompare(String s, String t) {
      
        
        String s1=build(s);
        String s2=build(t);

        if(s1.equals(s2)){
            return true;
        }
        else{
            return false;
        }
    }
    String build(String s){
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                st.push(s.charAt(i));
            }
            else{
                if(!st.isEmpty())
                st.pop();
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        
        return sb.reverse().toString();
        }
        
}
