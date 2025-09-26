class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int max=Integer.MAX_VALUE;
        int pos=-1;
        for(int i=0;i<points.length;i++){
            if(points[i][0]==x||points[i][1]==y){
                int num=Math.abs(points[i][0]-x)+Math.abs(points[i][1]-y);
                if(num<max){
                    max=num;
                    pos=i;
                }
            }
        }
        return pos;
    }
}
