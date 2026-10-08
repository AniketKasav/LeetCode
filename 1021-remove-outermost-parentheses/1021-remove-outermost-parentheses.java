class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans=new StringBuilder();
        StringBuilder curr=new StringBuilder();
        int bal=0;
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(bal==0 && curr.length()>0){
                curr.deleteCharAt(0);
                curr.deleteCharAt(curr.length()-1);
                ans.append(curr);
                curr.setLength(0);
            }
            if(ch=='('){
                bal++;
            }else if(ch==')'){
                bal--;
            }
            curr.append(ch);
        }
    curr.deleteCharAt(0);
    curr.deleteCharAt(curr.length()-1);
    ans.append(curr);
    return ans.toString();
    }
}