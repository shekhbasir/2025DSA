class Solution {
    public int removeDuplicates(int[] nums) {
    int n=nums.length;

        int count=1;
        int k=1;
        for(int i=0;i<n-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[k]=nums[i+1];
                k++;
                count++;
            }
        }

         return count;
    }
}