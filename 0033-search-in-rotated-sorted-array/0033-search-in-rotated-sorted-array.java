class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int ans=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                ans=i;
            }
        }
        return ans;
    }
}