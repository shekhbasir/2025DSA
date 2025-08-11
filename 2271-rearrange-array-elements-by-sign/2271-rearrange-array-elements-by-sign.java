class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int countp=0;
        int countn=1;
        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                temp[countp]=nums[i];
                countp=countp+2;
            }else{
                temp[countn]=nums[i];
                countn=countn+2;
            }
        }
        return temp;
    }
}