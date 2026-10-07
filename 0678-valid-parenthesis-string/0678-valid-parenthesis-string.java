class Solution {
    public boolean checkValidString(String s) {
        Boolean[][] memo=new Boolean[s.length()][s.length()+1];
       return check(s,0,0,memo);
    }

    boolean check(String s,int idx,int balance,Boolean[][] memo){
        if (balance < 0) {
            return false;
        }
        if(idx==s.length()){
            if(balance==0){
                return true;
            }else{
                return false;
            }
        }
        if(memo[idx][balance]!=null){
            return memo[idx][balance];
        }
        char ch=s.charAt(idx);
        boolean ans;
        if(ch=='('){
           ans=check(s,idx+1,balance+1,memo);
        }else if(ch==')'){
            ans=check(s,idx+1,balance-1,memo);
        }else{
            ans=check(s,idx+1,balance-1,memo) || check(s,idx+1,balance+1,memo) || check(s,idx+1,balance,memo);
        }
        memo[idx][balance]=ans;
        return ans;
    }
}