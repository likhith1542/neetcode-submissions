class Solution {
    int dp[];
    public int coinChange(int[] coins, int amount) {
        dp=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;

        for(int coin:coins){
            for(int val=coin;val<=amount;val++){
                dp[val]=Math.min(dp[val],1+dp[val-coin]);
            }
        }

        return dp[amount]>amount?-1:dp[amount];
    }

}
