class Solution {

    int memo[]=new int[101];

    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];

        Arrays.fill(memo,-1);
        int skipFirst=helper(nums,1,nums.length);

        Arrays.fill(memo, -1);
        int skipLast=helper(nums,0,nums.length-1);

        return Math.max(skipFirst,skipLast);
    }

    public int helper(int nums[],int index,int end){
        if(index>=end)return 0;

        if(memo[index]!=-1)return memo[index];

        int rob=nums[index]+helper(nums,index+2,end);
        int dRob=helper(nums,index+1,end);

        return memo[index]=Math.max(rob,dRob);
    }
}
