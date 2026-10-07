class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> ans=new ArrayList<>();
        StringBuilder curr=new StringBuilder();
        int[] minCount=new int[1];
        minCount[0]=Integer.MAX_VALUE;
        removal(s,ans,curr,0,minCount,0,0);
        return ans;
    }

    void removal(String s,List<String> ans,StringBuilder curr,int currCount,int[] minCount,int balance,int idx){
        if(balance<0)return;
        if(idx==s.length()){
            if(balance==0 && currCount==minCount[0]){
               if (!ans.contains(curr.toString())) {
                    ans.add(curr.toString());
                }
                return;
            }else if(balance==0 && currCount<minCount[0]){
                minCount[0]=currCount;
                ans.clear();
                ans.add(curr.toString());
                return;
            }
            return;
        }
            
            char ch=s.charAt(idx);
            if (ch != '(' && ch != ')') {
            // letter → keep it only
             curr.append(ch);
             removal(s, ans, curr, currCount, minCount, balance, idx + 1);
             curr.deleteCharAt(curr.length() - 1);
            }else{
            curr.append(ch);
            if(ch=='('){
                balance++;
            }else if(ch==')'){
                balance--;
            }
            
            removal(s,ans,curr,currCount,minCount,balance,idx+1);
            curr.deleteCharAt(curr.length()-1);
            if(ch==')'){
                balance++;
            }else if(ch=='('){
                balance--;
            }
            removal(s,ans,curr,currCount+1,minCount,balance,idx+1);
            }
    }
}