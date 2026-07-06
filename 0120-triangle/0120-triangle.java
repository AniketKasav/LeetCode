class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
         Integer memo[][]=new Integer[n][n];
        // for(int i=0;i<memo.length;i++){
        //     Arrays.fill(memo[i],-1);
        // }
        return dfs(0,0,triangle,memo);
    }

    int dfs(int i,int j,List<List<Integer>> triangle,Integer[][] memo){
        if(i>=triangle.size() || j>=triangle.get(i).size()){
            return 0;
        }
        if(memo[i][j]!=null){
            return memo[i][j];
        }
        memo[i][j]=triangle.get(i).get(j)+Math.min(dfs(i+1,j,triangle,memo),dfs(i+1,j+1,triangle,memo));
        return memo[i][j];
    }
}