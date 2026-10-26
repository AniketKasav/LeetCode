class Solution {
    public int closedIsland(int[][] grid) {
        // So your base-condition thinking is:
        // Outside grid → false
        // Cell is 1     → true
        // Cell is 0     → explore 4 directions

        int ans=0;
        int rows=grid.length;
        int cols=grid[0].length;
       for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            if(grid[i][j]==0){
                boolean result=bfs(grid,i,j);
                if(result)ans++;
            }
            
        }
       }
        return ans;
    }

    public boolean bfs (int[][] grid,int i,int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length){
            return false;
        }
        if(grid[i][j]==1){
            return true;
        }
        grid[i][j]=1;
        boolean r1 = bfs(grid,i-1,j);
        boolean r2 = bfs(grid,i,j-1);
        boolean r3 = bfs(grid,i+1,j);
        boolean r4 = bfs(grid,i,j+1);
        boolean result = r1 && r2 && r3 && r4;
        return result;
    }
}