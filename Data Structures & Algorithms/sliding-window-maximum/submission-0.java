class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int ws=nums.length-k+1;
        int res[]=new int[ws];
        Deque<Integer> dq=new ArrayDeque<>();

        for(int r=0;r<nums.length;r++){
            if(!dq.isEmpty() && dq.peekFirst()<=r-k)dq.pollFirst();

            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[r])dq.pollLast();

            dq.offerLast(r);

            if(r>=k-1)res[r-(k-1)]=nums[dq.peekFirst()];
        }

        return res;
    }
}
