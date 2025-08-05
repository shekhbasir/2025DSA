class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<=n;i++){
            count+=i;
        }
int arrsum=0;
        for(int i=0;i<n;i++){
            arrsum=arrsum+nums[i];

        }

        int k=count-arrsum;
        return k;
    }
}