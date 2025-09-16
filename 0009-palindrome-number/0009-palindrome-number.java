class Solution {
    public boolean isPalindrome(int x) {
        int org=x;
        int rev=0;
        boolean kam=true;
        while(x>0){
            int dig=x%10;
            rev=rev*10+dig;
            x=x/10;
        }
        if(rev!=org){
            return false;
        }
        return true;
    }
}