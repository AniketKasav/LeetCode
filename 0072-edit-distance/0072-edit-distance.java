class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int[][] dp=new int[n+1][m+1];
        for(int i=0;i<n;i++){
            dp[i][m]=n-i;
        }
        for(int j=0;j<m;j++){
            dp[n][j]=m-j;
        }

        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                char ch1=word1.charAt(i);
                char ch2=word2.charAt(j);
                if(ch1==ch2){
                    dp[i][j]=dp[i+1][j+1];
                }else{
                    int ans=Math.min(dp[i+1][j+1],Math.min(dp[i][j+1],dp[i+1][j]));
                    dp[i][j]=ans+1;
                }
            }
        }
        return dp[0][0];
    }
}