class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int num=x;
        while(x>0){
            int h=x%10;
            rev=(rev*10)+h;
            x=x/10;
        }
        if(num==rev){
            return true;
        }else{
            return false ;
        }
    }
}