class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int tsum=0;
        for(int num:nums){
            tsum+=num;
        }
        if (target > tsum || target < -tsum) {
    return 0;
}
        int dp[][]=new int[nums.length+1][2*tsum+1];
        
        dp[nums.length][tsum+target]=1;
        for(int i=nums.length-1;i>=0;i--){
            for(int j=2*tsum;j>=0;j--){
                int plus = j + nums[i];
int minus = j - nums[i];

if (plus <= 2 * tsum) {
    dp[i][j] += dp[i + 1][plus];
}

if (minus >= 0) {
    dp[i][j] += dp[i + 1][minus];
}
            }
        }
        return dp[0][tsum];
    }
}