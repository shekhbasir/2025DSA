class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int l = k % n; 

        
        int temp[] = new int[l];
        for (int i = 0; i < l; i++) {
            temp[i] = nums[n - l + i];  
        }

        
        for (int i = n - l - 1; i >= 0; i--) {
            nums[i + l] = nums[i];
        }

        
        for (int i = 0; i < l; i++) {
            nums[i] = temp[i];
        }
    }
}
