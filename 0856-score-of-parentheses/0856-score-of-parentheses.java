class Solution {
    public int scoreOfParentheses(String s) {
        int balance=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                balance++;
            }else if(ch==')'){
                balance--;
                if (s.charAt(i - 1) == '(') {
                    ans += 1 << balance;
                }
            }
        }
        return ans;
    }
}