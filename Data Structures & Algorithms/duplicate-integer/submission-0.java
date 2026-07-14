class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> hset=new HashSet<>();

        for(int num:nums){
            hset.add(num);
        }

        return !(hset.size()==nums.length);
        
    }
}