class Solution {
    public int numSquares(int n) {
        int dp[]=new int[n+1];
        dp[0]=0;
        for(int i=1;i<=n;i++){
            int min=Integer.MAX_VALUE;
            for(int s=1;s*s<=i;s++){
                int sq=s*s;
                if(min>dp[i-sq]){
                    min=dp[i-sq];
                }   
            }
            dp[i]=min+1;
        }
        return dp[n];
    }
}