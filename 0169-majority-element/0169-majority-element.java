class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> st=new HashMap<>();
        int count=1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int p=nums[i];
            if(st.containsKey(p)){
                st.put(p,st.get(p)+1);
            }else{
                st.put(p,1);
            }
        }

        int val=n/2;
        int t=0;
        for(int k:st.keySet()){
            if(st.get(k)>val){
                return k;
            }
        }
        return -1;
    }
}