class Solution {

    static void merg(int nums[],int st,int mid,int end){
        int n=nums.length;
        int i=st;
        int j=mid+1;
        int k=0;
        int temp[]=new int[end-st+1];

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
    static void divid(int nums[],int st,int end){
        if(st<end){
            int mid=st+(end-st)/2;
            divid(nums,st,mid);
            divid(nums,mid+1,end);

            merg(nums,st,mid,end);
        }
    }
    public void sortColors(int[] nums) {
        divid(nums,0,nums.length-1);
    }
}