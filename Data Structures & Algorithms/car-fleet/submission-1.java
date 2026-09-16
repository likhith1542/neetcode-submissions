class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        
        Integer idx[]=new Integer[n];
        for(int i=0;i<n;i++)idx[i]=i;

        Arrays.sort(idx,(a,b)->position[b]-position[a]);

        int fleets=0;
        float maxTime=0;

        for(int i=0;i<n;i++){
            float time=(float)(target-position[idx[i]])/speed[idx[i]];

            if(time>maxTime){
                fleets++;
                maxTime=time;
            }    
        }

        return fleets;


    }
}
