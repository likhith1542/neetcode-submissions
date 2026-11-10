class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();

        Arrays.sort(nums);

        helper(nums,0,new ArrayList<>(),ans,target);

        return ans;
    }

    public void helper(int nums[],int index,List<Integer> curr,List<List<Integer>> ans,int target){
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(index==nums.length || target<0)return;

        curr.add(nums[index]);
        helper(nums,index+1,curr,ans,target-nums[index]);
        curr.remove(curr.size()-1);

        int next=index+1;
        while(next<nums.length && nums[next]==nums[index]){
            next++;
        }
        helper(nums,next,curr,ans,target);

        
    }
}
