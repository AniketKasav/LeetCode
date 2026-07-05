class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m][n];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return dfs(0,0,grid,dp);
    }
    int dfs(int i,int j,int[][] grid,int[][] dp){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==1){
            return 0;
        }
        if(i==grid.length-1 && j==grid[0].length-1){
            return 1;
        }
        
        if(dp[i][j]!= -1){
            return dp[i][j];
        }
        dp[i][j]=dfs(i+1,j,grid,dp)+dfs(i,j+1,grid,dp);
        return dp[i][j];
    }
}