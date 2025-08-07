class Solution {

    public int missingNumber(int[] nums) {
        int sumarr=0;
        for(int i=0;i<nums.length;i++){
            sumarr=sumarr+nums[i];
        }
        
        int count=0;
        for(int i=0;i<=nums.length;i++){
            count=count+i;
        }

        int k=count-sumarr;
        return k;

    }
}