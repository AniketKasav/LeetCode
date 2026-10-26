class Solution {
    public int countIslands(int[][] grid, int k) {
        //first solve this problem : 1254. Number of Closed Islands

        int rows=grid.length;
        int cols=grid[0].length;
        int ans=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]>0){
                   long result= dfs(grid,i,j);
                   if(result % k==0)ans++;
                }
            }
        }
        return ans;
    }

    long dfs(int[][] grid,int i,int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length){
            return 0;
        }
        if(grid[i][j]==0){
            return 0;
        }
        long ans=0;
        ans+=grid[i][j];
        grid[i][j]=0;
        long a=dfs(grid,i-1,j);
        long b=dfs(grid,i,j+1);
        long c=dfs(grid,i+1,j);
        long d=dfs(grid,i,j-1);
        ans+=(a+b+c+d);
        return ans;
    }
}