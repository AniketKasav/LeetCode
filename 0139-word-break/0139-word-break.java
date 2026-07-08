class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean []memo=new Boolean[s.length()];
        return helpher(s,wordDict,0,memo);
    }

    boolean helpher(String s, List<String> wordDict,int curridx,Boolean []memo){
        if(curridx==s.length())return true;
        if(memo[curridx]!=null){
            return memo[curridx];
        }
        
        for(String word:wordDict){
            if(curridx+word.length()>s.length())continue;
            boolean match=true;
            for(int i=0;i<word.length();i++){
                if(s.charAt(i+curridx)!=word.charAt(i)){
                    match=false;
                    break;
                }
            }
            if(match){
                if(helpher(s,wordDict,curridx+word.length(),memo)){
                    memo[curridx]=true;
                    return true;
                }
            }
        }
        memo[curridx]=false;
        return false;
    }
}