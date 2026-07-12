class Solution {
    public int change(int amount, int[] coins) {
        // int[][] dp=new int[coins.length+1][amount+1];
        // for(int i=0;i<dp.length;i++){
        //     Arrays.fill(dp[i],-1);
        // }
        // return helpher(amount,coins,0,dp);

        int dp[]=new int[amount+1];
        dp[0]=1;
        for(int coin:coins){
            for(int i=coin;i<=amount;i++){
                dp[i]+=dp[i-coin];
            }
        }
        return dp[amount];
    }

    // int helpher(int Ramount, int[] coins,int idx,int[][] dp){
    //     if(Ramount==0)return 1;
    //     if(Ramount<0 || idx==coins.length)return 0;
    //     if(dp[idx][Ramount]!=-1){
    //         return dp[idx][Ramount];
    //     }
        

    //     dp[idx][Ramount]=helpher(Ramount-coins[idx],coins,idx,dp)+helpher(Ramount,coins,idx+1,dp);
    //     return dp[idx][Ramount];

    // }
}