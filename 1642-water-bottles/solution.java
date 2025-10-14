class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
         int sum=numBottles;
        while(numBottles>=numExchange){
        int n1=numBottles/numExchange;
        int n2=numBottles%numExchange;
        sum=sum+n1;
        int n3=n1+n2;
        numBottles=n3;


        }
        return sum;
        


    }
}
