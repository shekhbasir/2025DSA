class Solution {
    public void moveZeroes(int[] nums) {
      
        int n=nums.length;
        int k=0;


        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[k]=nums[i];
                k++;
            }
        }

        int val=nums.length-k;
        for(int i=k;i<n;i++){
            nums[i]=0;
        }
    }
}