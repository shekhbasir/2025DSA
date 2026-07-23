class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int kam1=-1;
        int kam2=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                if(kam1==-1){
                    kam1=i;
                }
                kam2=i;
            }
        }
        return new int[]{kam1,kam2};
    }
}