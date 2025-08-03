class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        // // int temp=0;
        // // int p=0;
        // // // for(int i=0;i<n;i++){
        // // //     for()
        // // // }

        // // int arr[]=new int[n];
        // // while(p<n-1){
        // //     if(nums[p]!=nums[p+1]){
        // //         arr[p]=nums[p];
        // //         p++;
        // //     }
        // // }

        // // return p;

        // int i=0;
        // for(int j=1;j<n;j++){
        //     if(nums[i]!=nums[j]){
        //         i++;
        //         nums[i]=nums[j];
        //     }
        // }
        // return i+1;




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