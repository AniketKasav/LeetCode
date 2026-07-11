class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int memo[][]=new int[text1.length()][text2.length()];
        for(int i=0;i<memo.length;i++){
            Arrays.fill(memo[i],-1);
        }
        return solve(0,0,text1,text2,memo);
    }

    public int solve(int i,int j,String text1,String text2,int[][] memo){
        if(i==text1.length() || j==text2.length()){
            return 0;
        }
        if(memo[i][j]!=-1){
            return memo[i][j];
        }
        if(text1.charAt(i)==text2.charAt(j)){
            memo[i][j]=1+solve(i+1,j+1,text1,text2,memo);
            return memo[i][j];
        }else{
            int ans=Math.max(solve(i+1,j,text1,text2,memo),solve(i,j+1,text1,text2,memo));
            memo[i][j]=ans;
            return memo[i][j];
        }
    }
}