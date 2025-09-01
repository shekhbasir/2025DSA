class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int higher=n-1;
        int ans=n;
        while(low<=higher){
            int mid=low+(higher-low)/2;
            if(nums[mid]>=target){
                ans=mid;
                higher=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}