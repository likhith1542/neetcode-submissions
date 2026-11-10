class Solution {
    int memo[]=new int[101];

    public int rob(int[] nums) {
        Arrays.fill(memo,-1);
        return helper(nums,0);
    }

    public int helper(int nums[],int index){
        if(index>=nums.length)return 0;

        if(memo[index]!=-1)return memo[index];

        int rob=nums[index]+helper(nums,index+2);
        int dRob=helper(nums,index+1);

        return memo[index]=Math.max(rob,dRob);
    }
}
