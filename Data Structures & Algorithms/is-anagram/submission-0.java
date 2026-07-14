class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;

        Map<Character,Integer> hmap=new HashMap<>();

        for(char ch:s.toCharArray()){
            hmap.put(ch,hmap.getOrDefault(ch,0)+1);
        }

        for(char ch:t.toCharArray()){
            hmap.put(ch,hmap.getOrDefault(ch,0)-1);
        }

        for (Integer value : hmap.values()) {
            if(value!=0)return false;
        }

        return true;

    }
}
