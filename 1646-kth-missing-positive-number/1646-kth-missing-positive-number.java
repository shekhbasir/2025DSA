class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int lastel = arr[n - 1];
        int kam = 1;
        int l = 0;

        int arr1[] = new int[lastel + k]; 

        for (int i = 0; i < arr.length; i++) {
            while (kam < arr[i]) {   
                arr1[l] = kam;
                l++;
                kam++;
            }
            kam++; 
        }

        while (l < k) {   
            arr1[l] = kam;
            l++;
            kam++;
        }

        return arr1[k - 1];
    }
}
