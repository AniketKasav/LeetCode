class Solution {
    public boolean canPartition(int[] nums) {
        int tamount=0;
        for(int num:nums){
            tamount+=num;
        }
        if(tamount%2!=0)return false;
        int target=tamount/2;
        // int[][]dp=new int[nums.length+1][target+1];
        // for(int i=0;i<dp.length;i++){
        //     Arrays.fill(dp[i],-1);
        // }
        // return helpher(nums,target,0,0,dp);
        //int n=nums.length;
        // boolean[][]dp=new boolean[n+1][target+1];
        // for(int i=0;i<n+1;i++){
        //     dp[i][0]=true;
        // }
        // for(int i=1;i<=n;i++){
        //     for(int sum=1;sum<=target;sum++){
        //         if(sum<nums[i-1]){
        //             dp[i][sum]=dp[i-1][sum];
        //         }
        //         else{
        //             dp[i][sum]=dp[i-1][sum] || dp[i-1][sum-nums[i-1]];
        //         }
        //     }
        // }
        boolean dp[]=new boolean[target+1];
        dp[0]=true;
        for(int num:nums){
            for(int i=target;i>=num;i--){
                dp[i]=dp[i]||dp[i-num];
            }
        }

        return dp[target];

    }

    // boolean helpher(int[] nums,int target,int idx,int currsum,int[][] dp){
    //     if(currsum==target){
    //         return true;
    //     }
    //     if(idx==nums.length || currsum>target)return false;
    //     if(dp[idx][currsum]!=-1)return dp[idx][currsum]==1;

    //     boolean ans=(helpher(nums,target,idx+1,currsum,dp) || helpher(nums,target,idx+1,currsum+nums[idx],dp));
    //     dp[idx][currsum]=ans?1:0;
    //     return ans;
    // }
}