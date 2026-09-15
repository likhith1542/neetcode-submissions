class Solution {
    public int trap(int[] heights) {
        int n=heights.length;
        int lmaxs[]=new int[n];
        int rmaxs[]=new int[n];

        int rmax=Integer.MIN_VALUE,lmax=Integer.MIN_VALUE;
        int l=0, r=n-1;

        while(r>=0){
            rmax=Math.max(rmax,heights[r]);
            rmaxs[r]=rmax;
            r--;
        }

        while(l<n){
            lmax=Math.max(lmax,heights[l]);
            lmaxs[l]=lmax;
            l++;
        }

        int total=0;

        for(int i=0;i<n;i++){
            total+=Math.min(lmaxs[i],rmaxs[i])-heights[i];
        }

        return total;
    }
}

