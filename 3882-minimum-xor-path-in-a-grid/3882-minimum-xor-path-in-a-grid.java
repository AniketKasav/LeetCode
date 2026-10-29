// class Solution {
//     public int minCost(int[][] grid) {
//         int ans=helpher(grid,0,0,0);
//         return ans;
//     }

//     public int helpher(int[][] grid,int i,int j,int ans){
//         if(i==grid.length-1 && j==grid[0].length-1){
//             return ans^grid[i][j];
//         }
//         if(i<0 || i>=grid.length || j<0 || j>=grid[0].length){
//             return Integer.MAX_VALUE;
//         }
//         ans=ans^grid[i][j];
//         int curr1=helpher(grid,i+1,j,ans);
//         //System.out.println("curr1 : "+curr1);
//         int curr2=helpher(grid,i,j+1,ans);
//         //System.out.println("curr2 : "+curr2);
//         return Math.min(curr1,curr2);
//     }
// }

class Solution {
    public int minCost(int[][] grid) {
        int n = grid[0].length;
        boolean[][] dp = new boolean[n][1024];  // dp[j][x]: XOR x can reach column j of the row above
        dp[0][0] = true;
        for (int[] row : grid)
            for (int j = 0; j < n; j++) {
                boolean[] next = new boolean[1024];
                for (int x = 0; x < 1024; x++)
                    if (dp[j][x] || j > 0 && dp[j - 1][x]) next[x ^ row[j]] = true;  // from above or from the left
                dp[j] = next;
            }
        int x = 0;
        while (!dp[n - 1][x]) x++;
        return x;
    }
}