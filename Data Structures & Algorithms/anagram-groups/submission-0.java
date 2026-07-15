class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for(String str:strs){
            int temp[]=new int[26];
            for(char ch:str.toCharArray())temp[ch-'a']+=1;
            String key=Arrays.toString(temp);

            groups.computeIfAbsent(key,k->new ArrayList()).add(str);
        }

        return new ArrayList<>(groups.values());
    }
    
}
