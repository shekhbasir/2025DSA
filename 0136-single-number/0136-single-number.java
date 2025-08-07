class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> st=new HashMap<>();

    for(int val:nums){
            if(st.containsKey(val)){
                st.put(val,st.get(val)+1);
            }else{
                st.put(val,1);
            }
        }
        for(int j:st.keySet()){
            if(st.get(j) == 1)  return j;
          
        }
        return -1;
    }
}