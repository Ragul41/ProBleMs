class Solution {
    public boolean containsDuplicate(int[] nums) {
      HashMap<Integer,Integer> h=new HashMap<>();
      //int idx=0;
      for(int n:nums){
        if(h.containsKey(n)){
            return true;
        }
        h.put(n,0);
      }
      return false;
        
        
    }
}
