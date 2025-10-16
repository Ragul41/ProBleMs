class Solution {
    public String interpret(String command) {
        int l=command.length();
        String s="";
        for(int i=0;i<l;i++){
            char c=command.charAt(i);
            if(c=='G'){
             s=s+'G';
            }
            else if(c=='('){
               
                
                if(command.charAt(i+1)=='a'){
                   s=s+"al"; 
                   i=i+3;
                }
                else if(command.charAt(i+1)==')'){
                    s=s+'o';
                    i++;
                }


            }

        }

        return s;
        
    }
}
