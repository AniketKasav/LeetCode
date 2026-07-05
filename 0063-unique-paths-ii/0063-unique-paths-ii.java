class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return dfs(0,0,m,n,grid,dp);
    }
    int dfs(int i,int j,int m,int n,int[][] grid,int[][] dp){
        if(i<0 || j<0 || i>=m || j>=n || grid[i][j]==1){
            return 0;
        }
        if(i==m-1 && j==n-1){
            return 1;
        }
        
        if(dp[i][j]!= -1){
            return dp[i][j];
        }
        dp[i][j]=dfs(i+1,j,m,n,grid,dp)+dfs(i,j+1,m,n,grid,dp);
        return dp[i][j];
    }
}