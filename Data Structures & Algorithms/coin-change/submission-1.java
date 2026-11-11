class Solution {
    int dp[][];
    public int coinChange(int[] coins, int amount) {
        dp=new int[amount+1][coins.length+1];
        for(int i=0;i<amount+1;i++){
            Arrays.fill(dp[i],-1);
        }

        int ans=helper(coins,amount,0);
        return ans==Integer.MAX_VALUE?-1:ans;
    }

    public int helper(int coins[],int amount,int index){
        if(amount==0)return 0;
        if(index==coins.length)return Integer.MAX_VALUE;

        if(dp[amount][index]!=-1)return dp[amount][index];

        int dUse=helper(coins,amount,index+1);
        int use=Integer.MAX_VALUE;
        if(amount>=coins[index]){
            int temp=helper(coins,amount-coins[index],index);
            use=(temp==Integer.MAX_VALUE)?temp:1+temp;
        }

        return dp[amount][index]=Math.min(dUse,use);
    }
}
