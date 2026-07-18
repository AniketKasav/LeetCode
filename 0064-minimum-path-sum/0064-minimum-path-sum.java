class Solution {
    public int minPathSum(int[][] grid) {
        int [][]dp=new int[grid.length][grid[0].length];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return dfs(0,0,grid,dp);
    }
    int dfs(int i,int j,int[][] grid,int [][]dp){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length){
            return Integer.MAX_VALUE;
        }
        if (i == grid.length - 1 && j == grid[0].length - 1){
            return grid[i][j];
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int down=dfs(i+1,j,grid,dp);
        int right=dfs(i,j+1,grid,dp);
        int min=Math.min(down,right);
        if(min==Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        dp[i][j]=grid[i][j]+min;
        return dp[i][j];
    }
    
}