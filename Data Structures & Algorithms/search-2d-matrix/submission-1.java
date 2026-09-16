class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rl=0,rh=matrix.length-1;

        while(rl<=rh){
            int mid=rl+(rh-rl)/2;

            if(matrix[mid][0]==target)return true;
            else if(matrix[mid][0]<target)rl=mid+1;
            else rh=mid-1;
        }

        if(rh==-1)return false;

        int cl=0,ch=matrix[0].length-1;

        while(cl<=ch){
            int mid=cl+(ch-cl)/2;

            if(matrix[rh][mid]==target)return true;
            else if(matrix[rh][mid]<target)cl=mid+1;
            else ch=mid-1;
        }

        return false;
    }
}
