class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> hMap=new HashMap<>();
        int l=0,maxFreq=0,best=0;

        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            hMap.put(ch,hMap.getOrDefault(ch,0)+1);
            maxFreq=Math.max(maxFreq,hMap.get(ch));

            if((r-l+1)-maxFreq>k){
                char lch=s.charAt(l);
                hMap.put(lch,hMap.get(lch)-1);
                l++;
            }

            best=Math.max(best,r-l+1);
        }

        return best;

    }
}
