class Solution {
    public int reverse(int x) {
        long rev = 0;  
        int org = x;

        while (x != 0) {
            int dig = x % 10;
            rev = rev * 10 + dig;
            x = x / 10;
        }

        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0; 
        }

        return (int) rev;
    }
}
