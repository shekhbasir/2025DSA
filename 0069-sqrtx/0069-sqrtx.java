class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int l = 1, high = x, ans = 0;

        while (l <= high) {
            int mid = l + (high - l) / 2;

            long square = (long) mid * mid; 

            if (square == x) {
                return mid; 
            } else if (square < x) {
                ans = mid;   
                l = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}
