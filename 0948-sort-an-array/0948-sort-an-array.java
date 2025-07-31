class Solution {

    void merg(int arr[],int st,int mid,int end){
        int i=st;
        int j=mid+1;
        int k=0;

        int temp[]=new int[end-st+1];

        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }

        while(i<=mid){
            temp[k++]=arr[i++];
        }

        while(j<=end){
            temp[k++]=arr[j++];
        }


        for(int p=0;p<temp.length;p++){
            arr[st+p]=temp[p];
        }
        
    }


    void  divid(int arr[],int st,int end){
        if(st<end){
            int mid=st+(end-st)/2;

            divid(arr,st,mid);
            divid(arr,mid+1,end);

            merg(arr,st,mid,end);
            
        }
    }
    public int[] sortArray(int[] nums) {

        divid(nums,0,nums.length-1);
        return nums;
    }
}