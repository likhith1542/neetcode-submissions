class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer> st=new Stack<>();

        int maxArea=0;

        for(int i=0;i<=n;i++){
            int h=(i==n?0:heights[i]);

            while(!st.isEmpty() && heights[st.peek()]>=h){
                int height=heights[st.pop()];
                int leftLowerIndex=(st.isEmpty()?-1:st.peek());
                int rightLowerIndex=i;
                int width=rightLowerIndex-leftLowerIndex-1;
                int area=height*width;
                maxArea=Math.max(maxArea,area);
            }

            st.push(i);
        }

        return maxArea;
    }
}
