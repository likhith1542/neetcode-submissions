class Solution {
    int start = 0, maxLen = 0;

    public String longestPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            expand(s, i, i);       // odd: center is s[i]
            expand(s, i, i + 1);   // even: center is between s[i], s[i+1]
        }
        return s.substring(start, start + maxLen);
    }

    void expand(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--; r++;
        }
        int len = r - l - 1;                  // loop overshoots 1 on each side
        if (len > maxLen) { maxLen = len; start = l + 1; }
    }
}