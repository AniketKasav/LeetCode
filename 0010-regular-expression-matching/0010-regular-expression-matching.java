class Solution {
    public boolean isMatch(String s, String p) {
        if (s == null || p == null) {
             return false;
        }
        boolean[][] dp=new boolean[s.length()+1][p.length()+1];
        dp[0][0]=true;
        // i-->s
        // j-->p
        // initilize the empty string which matches the pattern like a*--> can represent the empty charcter
        for(int j=0;j<p.length();j++){
            if(p.charAt(j)=='*' && dp[0][j-1]){
                dp[0][j+1]=true;
            }
        }

        for(int i=0;i<s.length();i++){
            for(int j=0;j<p.length();j++){
                if(p.charAt(j)=='.'){
                    dp[i+1][j+1]=dp[i][j];
                }
                if(p.charAt(j)==s.charAt(i)){
                    dp[i+1][j+1]=dp[i][j];
                }
                if(p.charAt(j)=='*'){
                    if(s.charAt(i)!=p.charAt(j-1) && p.charAt(j-1)!='.'){
                        dp[i+1][j+1]=dp[i+1][j-1];
                    }else{
                        dp[i+1][j+1]=(dp[i+1][j] || dp[i][j+1] || dp[i+1][j-1]);
                    }
                }
            }
        }
        return dp[s.length()][p.length()];
    }
}