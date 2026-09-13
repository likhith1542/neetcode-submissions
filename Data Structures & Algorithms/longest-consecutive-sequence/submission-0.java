class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> uSet=new HashSet<Integer>();
        for(int num:nums){
            uSet.add(num);
        }

        int longest=0;
        for(int num:uSet){
            if(uSet.contains(num-1))continue;

            int curr=num+1;
            int len=1;
            while(uSet.contains(curr)){
                len++;
                curr++;
            }

            longest=Math.max(longest,len);
        }

        return longest;
    }
}
