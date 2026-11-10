class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();

        Arrays.sort(nums);

        helper(nums,0,new ArrayList<>(),ans);

        return ans;
    }

    public void helper(int nums[],int index,List<Integer> curr,List<List<Integer>> ans){
        if(index==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[index]);
        helper(nums,index+1,curr,ans);
        curr.remove(curr.size()-1);

        int next=index+1;
        while(next<nums.length && nums[next]==nums[index]){
            next++;
        }
        helper(nums,next,curr,ans);

        
    }
}
