class Solution {
    int ans=0;
    public int countSubstrings(String s) {
        longestPalindrome(s);

        return ans;
    }

    public void longestPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            expand(s, i, i);       // odd: center is s[i]
            expand(s, i, i + 1);   // even: center is between s[i], s[i+1]
        }
        
    }

    void expand(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--; r++;
            ans++;
        }
    }
}
