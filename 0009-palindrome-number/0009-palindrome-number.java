class Solution {
    public boolean isPalindrome(int x) {

        if(x<0) return false;

        int rev=0;
        int kam=x;
        while(kam>0){
            int lastdigt=kam%10;
            kam=kam/10;
            rev=(rev*10)+lastdigt;
        }

        if(rev==x)return true;
        return false;
        
    }
}