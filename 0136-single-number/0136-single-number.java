class Solution {

    static void merg(int nums[],int st,int mid,int end){
        int i=st;
        int j=mid+1;
        int temp[]=new int[end-st+1];
        int k=0;
        while(i<=mid && j<=end){
            if(nums[i]<nums[j]){
                temp[k++]=nums[i++];
            }else{
                temp[k++]=nums[j++];
            }
        }

        while(i<=mid){
            temp[k++]=nums[i++];
        }

        while(j<=end){
            temp[k++]=nums[j++];
        }

        for(int l=0;l<temp.length;l++){
            nums[st+l]=temp[l];
        }
    }
    static void divid(int nums[],int st,int end ){
      

        if(st<end){
            int mid=st+(end-st)/2;
            divid(nums,st,mid);
            divid(nums,mid+1,end);

            merg(nums,st,mid,end);
        }
    }
    public int singleNumber(int[] nums) {
          int st=0;
        int end=nums.length-1;
        divid(nums,st,end);

int k=0;
        for(int p=0;p<nums.length-1;p+=2){
            if(nums[p]!=nums[p+1]){
                
                return nums[p];
            
            }
           
        }

        return nums[nums.length-1];


    }
}