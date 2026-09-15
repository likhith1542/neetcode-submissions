class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();

        for(String s:tokens){
            int ch=s.charAt(0);

            if(s.length()==1 && (ch=='+' || ch=='-' || ch=='*' || ch=='/')){
                int e1=st.pop();
                int e2=st.pop();

                if(ch=='+'){
                    st.push(e2+e1);
                }else if(ch=='-'){
                    st.push(e2-e1);
                }else if(ch=='*'){
                    st.push(e2*e1);
                }else{
                    st.push(e2/e1);
                }
            }else{
                st.push(Integer.parseInt(s));
            }
        }

        return st.pop();
    }
}
