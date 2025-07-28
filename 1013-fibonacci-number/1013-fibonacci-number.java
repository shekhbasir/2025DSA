class Solution {
    static int sum(int i,int s){
        if(i==0) return i;
        if(i==1) return i;
        return (s+(sum(i-1,s)+sum(i-2,s)));
    }
    public int fib(int n) {
        int l=0;
     for(int k=0;k<=n;k++){
        l=sum(k,0);
     }
        return l;
    }
}