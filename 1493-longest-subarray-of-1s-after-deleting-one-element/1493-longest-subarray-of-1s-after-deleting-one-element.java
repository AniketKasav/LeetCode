class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int zcount=0;
        int ans=0;
        for(int right=0;right<nums.length;right++){
             if(nums[right]==0)zcount++;
            while(left<right && zcount>1){
                if(nums[left]==0)zcount--;
                left++;
            }
           
            ans=Math.max(ans,right-left);
        }
        return ans;
    }
}