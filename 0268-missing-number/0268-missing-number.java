class Solution {
    public int missingNumber(int[] nums) {
        HashMap<Integer,Integer> st=new HashMap<>();
        for(int k:nums){
            st.put(k,0);
        }
        int k=0;
        for(int i=0;i<=nums.length;i++){
            if(!st.containsKey(i)){
                return i;
            }
        }

return -1;
    }
}