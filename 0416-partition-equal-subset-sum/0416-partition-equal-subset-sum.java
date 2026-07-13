class Solution {
    public boolean canPartition(int[] nums) {
        int tamount=0;
        for(int num:nums){
            tamount+=num;
        }
        if(tamount%2!=0)return false;
        int target=tamount/2;
        int[][]dp=new int[nums.length+1][target+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return helpher(nums,target,0,0,dp);
    }

    boolean helpher(int[] nums,int target,int idx,int currsum,int[][] dp){
        if(currsum==target){
            return true;
        }
        if(idx==nums.length || currsum>target)return false;
        if(dp[idx][currsum]!=-1)return dp[idx][currsum]==1;

        boolean ans=(helpher(nums,target,idx+1,currsum,dp) || helpher(nums,target,idx+1,currsum+nums[idx],dp));
        dp[idx][currsum]=ans?1:0;
        return ans;
    }
}