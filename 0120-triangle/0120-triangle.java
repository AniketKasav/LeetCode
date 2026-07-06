class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
         Integer dp[][]=new Integer[n][n];
        // for(int i=0;i<dp.length;i++){
        //     Arrays.fill(dp[i],-1);
        // }
        return dfs(0,0,triangle,dp);
    }

    int dfs(int i,int j,List<List<Integer>> triangle,Integer[][] dp){
        if(i>=triangle.size() || j>=triangle.get(i).size()){
            return 0;
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        dp[i][j]=triangle.get(i).get(j)+Math.min(dfs(i+1,j,triangle,dp),dfs(i+1,j+1,triangle,dp));
        return dp[i][j];
    }
}