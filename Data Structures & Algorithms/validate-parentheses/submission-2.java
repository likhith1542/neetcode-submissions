class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<Character>();

        for(Character ch:s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }else{
                if(!st.isEmpty() && 
                ((ch==')' && st.peek()=='(') || 
                (ch=='}' && st.peek()=='{') || 
                (ch==']' && st.peek()=='[')))st.pop();
                else return false;
            }
        }

        return st.isEmpty();
    }
}
