class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxProfit=0;
        int maxSell=0;

        for(int i=n-1;i>=0;i--){
            maxSell=Math.max(maxSell,prices[i]);
            maxProfit=Math.max(maxProfit,maxSell-prices[i]);
        }

        return maxProfit;
    }
}
