class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] freq=new int[51];
        for(int x:nums){
            freq[x]++;
        }
        int ans=-1,n=nums.length;
        for(int i=0;i<n;i++){
            if(k==n || (freq[nums[i]]==1 && (k==1 || i==0 || i==n-1))){
                ans=Math.max(ans,nums[i]);
            }
        }
        return ans;
    }
}