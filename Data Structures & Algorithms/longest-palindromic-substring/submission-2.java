class Solution {

    String dp[][];

    public String longestPalindrome(String s) {
        int n=s.length();
        dp=new String[n][n];
        return helper(s,0,n-1);

    }

    public String helper(String s,int i,int j){
        if(isPal(s.substring(i,j+1)))return dp[i][j]=s.substring(i,j+1);

        if(dp[i][j]!=null)return dp[i][j];

        String rLeft=helper(s,i+1,j);
        String rRight=helper(s,i,j-1);

        return dp[i][j]=(rLeft.length()>=rRight.length()?rLeft:rRight);
    }

    public boolean isPal(String curr){
        int len=curr.length();

        for(int i=0;i<(len+1/2);i++){
            if(curr.charAt(i)!=curr.charAt(len-1-i))return false;
        }

        return true;
    }

}
