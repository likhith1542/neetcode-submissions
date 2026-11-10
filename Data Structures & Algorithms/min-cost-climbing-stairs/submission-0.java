class Solution {
    int memo[]=new int[101];

    public int minCostClimbingStairs(int[] cost) {
        return Math.min(helper(cost,0),helper(cost,1));    
    }

    public int helper(int cost[],int n){
        if(n==cost.length)return 0;
        if(n>cost.length)return Integer.MAX_VALUE;

        if(memo[n]!=0)return memo[n];

        return memo[n]=cost[n]+Math.min(helper(cost,n+1),helper(cost,n+2));
    }
}
