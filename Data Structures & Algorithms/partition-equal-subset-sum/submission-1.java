class Solution {

    Boolean memo[][];
    
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num:nums)sum+=num;
        if(sum%2==1)return false;

        memo=new Boolean[sum/2 +1][nums.length+1];

        return helper(nums,sum/2,0);
    }

    public boolean helper(int nums[],int target,int index){
        if(target==0)return true;
        if(target<0 || index==nums.length)return false;

        if(memo[target][index]!=null)return memo[target][index];

        return memo[target][index]=(helper(nums,target-nums[index],index+1) || helper(nums,target,index+1));
    }
}
