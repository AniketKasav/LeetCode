class Solution {
    public boolean hasValidPath(char[][] grid) {
        if(grid[0][0]==')')return false;
        int n=grid.length;
        int m=grid[0].length;
        if((n+m-1)%2==1)return false;

        int[][][] memo=new int[n][m][n+m];
        return solve(grid,memo,0,0,0);
        
    }

    boolean solve(char[][] grid,int[][][] memo,int diff,int r,int c){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length)return false;
        if(grid[r][c]=='(')diff++;
        if(grid[r][c]==')')diff--;
        if(diff<0)return false;
        if(memo[r][c][diff]==-1)return false;
        if(memo[r][c][diff]==1)return true;
        if(r==grid.length-1 && c==grid[0].length-1 && diff==0)return true;
        boolean way=solve(grid,memo,diff,r+1,c) || solve(grid,memo,diff,r,c+1);
        if(way){
            memo[r][c][diff]=1;
        }else{
            memo[r][c][diff]=-1;
        }
        if(memo[r][c][diff]==-1)return false;
        return true;
    }   
    
}