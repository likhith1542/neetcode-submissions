class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();

        helper(nums,0,new ArrayList<>(),ans,target);

        return ans;
    }

    public void helper(int nums[],int index,List<Integer> curr,List<List<Integer>> ans,int target){
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(index==nums.length || target<0)return;

        helper(nums,index+1,curr,ans,target);

        curr.add(nums[index]);
        helper(nums,index,curr,ans,target-nums[index]);
        curr.remove(curr.size()-1);

    }
}
