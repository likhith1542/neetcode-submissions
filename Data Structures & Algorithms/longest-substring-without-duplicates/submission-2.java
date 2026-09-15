class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> cMap=new HashMap<>();

        int maxlen=0;
        int pos=0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (cMap.containsKey(ch)) {
                maxlen = Math.max(maxlen, i - pos);
                pos = Math.max(pos, cMap.get(ch) + 1);
            }
            cMap.put(ch, i);
        }
        return Math.max(maxlen, s.length() - pos);
    }
}
