class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1, right = 0;
        for (int num : nums) {
            right = Math.max(right, num);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isValid(nums, threshold, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean isValid(int[] nums, int threshold, int divisor) {
        int total = 0;
        for (int num : nums) {
            total += (num + divisor - 1) / divisor;  
        }
        return total <= threshold;
    }
}
