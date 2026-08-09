class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return ans;
        }
        String[] digitString=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        StringBuilder sb=new StringBuilder();
        dfs(digitString,digits,sb,ans,0);
        return ans;
    }

    public void dfs(String[] digitString,String digits,StringBuilder sb,List<String> ans,int index){
        if(sb.length()==digits.length()){
            ans.add(sb.toString());
            return;
        }
        for(int i=0;i<digitString[digits.charAt(index)-'0'].length();i++){
            sb.append(digitString[digits.charAt(index)-'0'].charAt(i));
            dfs(digitString,digits,sb,ans,index+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}