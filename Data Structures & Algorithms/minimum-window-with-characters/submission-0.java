class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())return "";

        int need[]=new int[128];
        for(char ch:t.toCharArray())need[ch]++;

        int missing=t.length();

        int minLen=Integer.MAX_VALUE;
        int bestL=0;
        int l=0;

        for(int r=0;r<s.length();r++){
            if(need[s.charAt(r)]-- >0)missing--;

            while(missing==0){
                if(r-l+1<minLen){
                    minLen=r-l+1;
                    bestL=l;
                }

                if(need[s.charAt(l)]++==0)missing++;
                l++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(bestL, bestL + minLen);

        
    }
}
