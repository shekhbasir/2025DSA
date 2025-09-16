class Solution {
    public String largestOddNumber(String num) {
        if (num == null || num.length() == 0) return "";
        for (int i = num.length() - 1; i >= 0; i--) {
            char ch = num.charAt(i);
            if ((ch - '0') % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
