class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int index=n;
        for(int i=0;i<n;i++){
            if(nums[i]>=target){
                index=i;
                break;
            }
              
        }
       return index;
    }
}