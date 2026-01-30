class Solution {
    public boolean judgeCircle(String moves) {
        int n1=0;
        
        int n3=0;

        StringBuilder sb=new StringBuilder(moves);
        for(int i=0;i<moves.length();i++){
            if(sb.charAt(i)=='U'){
                n1++;
            }
            else if(sb.charAt(i)=='D'){
                n1--;
            }
            else if(sb.charAt(i)=='L'){
                n3++;
            }
            else{
                n3--;
            }
        }
     return(n1==0 && n3==0);
     
    }
}
