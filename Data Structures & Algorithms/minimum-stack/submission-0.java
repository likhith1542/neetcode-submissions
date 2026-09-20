class MinStack {
    private Deque<Integer> st;
    private Deque<Integer> mins;

    public MinStack() {
        st=new ArrayDeque<>();
        mins=new ArrayDeque<>();    
    }
    
    public void push(int val) {
        st.push(val);
        mins.push(mins.isEmpty()?val:Math.min(val,mins.peek()));
    }
    
    public void pop() {
        st.pop();
        mins.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return mins.peek();   
    }
}
