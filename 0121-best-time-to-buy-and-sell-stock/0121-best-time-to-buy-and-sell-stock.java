class Solution {
    public int maxProfit(int[] price) {
        int n=price.length;
        int dp[]=new int[n];
        int minp=price[0];
        for(int i=1;i<dp.length;i++){
            if(price[i]<minp)minp=price[i];
            dp[i]=Math.max(dp[i-1],price[i]-minp);
        }
        return dp[n-1];
    }
}