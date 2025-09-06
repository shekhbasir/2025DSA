class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int l1=0;
        int l2=0;
        int i=0;
        int tl=n+m;
        int arr[]=new int[tl];
        while(l1<n && l2<m){
            if(nums1[l1]<nums2[l2]){
                arr[i]=nums1[l1];
                l1++;
            }else{
                arr[i]=nums2[l2];
                l2++;
            }
            i++;
        }

        while(l1<n){
            arr[i++]=nums1[l1++];
        }
        while(l2<m){
            arr[i++]=nums2[l2++];
        }

       
        if (tl % 2 != 0) { 
    return (double) arr[tl / 2];
} else { 
    return (arr[tl/2 - 1] + arr[tl/2]) / 2.0;
}
    }

}