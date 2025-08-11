class Solution {
    public int maxProfit(int[] prices) {
        int minp=Integer.MAX_VALUE;
        int profit=0;
        int n=prices.length;
        for(int i=0;i<n;i++){
            if(prices[i]<minp){
                minp=prices[i];
            }else if(prices[i]-minp>profit){
                profit=prices[i]-minp;
            }
        }
        return profit;
    }
}