class Solution {

    Boolean memo[][];
    
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num:nums)sum+=num;
        if(sum%2==1)return false;

        boolean dp[]=new boolean[sum/2 +1];
        dp[0]=true;

        for(int num:nums){
            for(int t=sum/2;t>=num;t--){
                dp[t]=dp[t]||dp[t-num];
            }
        }

        return dp[sum/2];
    }

    
}
