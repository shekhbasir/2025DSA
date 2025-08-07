class Solution {

    public int missingNumber(int[] nums) {
        int sumarr=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            sumarr+=nums[i];
        }
        
        // int count=0;
       int count=n*(n+1)/2;

        int k=count-sumarr;
        return k;

    }
}