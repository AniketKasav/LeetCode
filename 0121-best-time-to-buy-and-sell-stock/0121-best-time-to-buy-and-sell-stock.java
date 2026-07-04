class Solution {
    public int maxProfit(int[] price) {
        int n=price.length;
        int dp[]=new int[n];
        int minp=price[0];
        for(int i=1;i<dp.length;i++){
            dp[i]=Math.max(dp[i-1],price[i]-minp);
            if(price[i]<minp)minp=price[i];
        }
        return dp[n-1];
    }
}