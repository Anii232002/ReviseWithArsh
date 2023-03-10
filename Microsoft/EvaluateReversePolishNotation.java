class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(int i = 0;i<tokens.length;i++)
        {
            if(tokens[i].equals("+"))
            {
                int ele2 = st.pop();
                int ele1 = st.pop();
                st.push(ele1+ele2);
            }
            else if(tokens[i].equals("-"))
            {
                int ele2 = st.pop();
                int ele1 = st.pop();
                st.push(ele1-ele2);
            }
            else if(tokens[i].equals("*"))
            {
                int ele2 = st.pop();
                int ele1 = st.pop();
                st.push(ele1*ele2);
            }
            else if(tokens[i].equals("/"))
            {
                int ele2 = st.pop();
                int ele1 = st.pop();
                st.push(ele1/ele2);
            }
            else
            {
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.pop();
    }

}