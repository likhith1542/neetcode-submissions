class Solution {

    String dp[][];
    String s;

    public String longestPalindrome(String s) {
        this.s=s;
        int n=s.length();
        dp=new String[n][n];
        return helper(0,n-1);

    }

    public String helper(int i,int j){
        if(dp[i][j]!=null)return dp[i][j];

        if(isPal(i,j))return dp[i][j]=s.substring(i,j+1);

        

        String rLeft=helper(i+1,j);
        String rRight=helper(i,j-1);

        return dp[i][j]=(rLeft.length()>=rRight.length()?rLeft:rRight);
    }

    public boolean isPal(int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }


}
