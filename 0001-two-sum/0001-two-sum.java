class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> st=new HashMap<>();
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++){
            int kam=target-nums[i];
            if(st.containsKey(kam)){
                // int arr[]={i,st.get(kam)};
                arr[0]=i;
                arr[1]=st.get(kam);
            }else{
                st.put(nums[i],i);
            }
        }
        return arr;
    }
}