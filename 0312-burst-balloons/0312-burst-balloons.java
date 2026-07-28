class Solution {
    public int maxCoins(int[] inums) {
        int n =inums.length;
        int nums[]=new int[n+2];
        nums[0]=nums[n+1]=1;
        for(int i=0;i<n;i++){
            nums[i+1]=inums[i];
        }
        int dp[][]=new int[n+2][n+2];

        for(int gap=2;gap<n+2;gap++){
            for(int left=0;left+gap<n+2;left++){
                int right=left+gap;
                for(int k=left+1;k<right;k++){
                   int curr=nums[left]*nums[k]*nums[right];
                   int total=dp[left][k]+curr+dp[k][right];
                   dp[left][right]=Math.max(dp[left][right],total);
                }
            }
        }
        return dp[0][n+1];
    }
}