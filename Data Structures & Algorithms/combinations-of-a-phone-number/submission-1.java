class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        Map<Character, String> map = new HashMap<>();

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        helper(digits,map,0,ans,"");

        return ans;
    }

    public void helper(String digits,Map<Character, String> map,int index,List<String> ans,String curr){
        if(index==digits.length()){
            if(curr!="" && curr.length()==digits.length())ans.add(curr);
            return;
        }

        helper(digits,map,index+1,ans,curr);

        String dCurr=map.get(digits.charAt(index));
        for(int i=0;i<dCurr.length();i++){
            helper(digits,map,index+1,ans,curr+dCurr.charAt(i));
        }
    }
}
