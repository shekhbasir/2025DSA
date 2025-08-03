class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int j=0;
        int count=0;
        int temp[]=new int[n];

        //simply it is going to push the value in new 
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
            temp[j++]=nums[i];
            count++;

            }
        }

        int val=n-count;
        for(int i=count;i<n;i++){
            temp[i]=0;
        }

        for(int i=0;i<n;i++){
            nums[i]=temp[i];
        }
    }
}