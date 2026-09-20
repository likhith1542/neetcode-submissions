class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        List<Integer> buckets[]=new List[nums.length+1];

        for(var e: map.entrySet()){
            int val=e.getKey();
            int freq=e.getValue();

            if(buckets[freq]==null)buckets[freq]=new ArrayList<>();
            buckets[freq].add(val);
        }

        int res[]=new int[k];
        int idx=0;
        for(int i=buckets.length-1;i>0 && idx<k ;i--){
            if(buckets[i]==null)continue;
            for(Integer val:buckets[i]){
                res[idx++]=val;
                if(idx==k)break;
            }
        }

        return res;
        
    }
}
