class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!st.isEmpty() && ch==')' && st.peek()=='('){
                st.pop();
            }else{
                st.push(ch);
            }
        }

        int ans=0;
        while(!st.isEmpty()){
            ans++;
            st.pop();
        }
        return ans;
    }
}