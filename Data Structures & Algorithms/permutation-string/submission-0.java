class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m=s1.length();
        int n=s2.length();

        if(m>n)return false;
        
        int need[]=new int[26];
        int win[]=new int[26];

        for(int i=0;i<m;i++){
            need[s1.charAt(i)-'a']++;
            win[s2.charAt(i)-'a']++;
        }

        if(Arrays.equals(need,win))return true;

        for(int r=m;r<n;r++){
            win[s2.charAt(r)-'a']++;
            win[s2.charAt(r-m)-'a']--;
            if(Arrays.equals(need,win))return true;
        }

        return false;
        
    }
}
