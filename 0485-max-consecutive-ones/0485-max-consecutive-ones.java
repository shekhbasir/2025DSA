class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        // if(nums.length-1==0){
        //     return 1;
        // }
  int count=0;
        for(int i=0;i<nums.length;i++){
          
           
                if(nums[i]==1){
                    count++;
                    if(count>max){
                        max=count;
                    }
            
            
            }else{
                count=0;
            }
        }
        return max;
    }
}