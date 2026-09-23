class Solution {
    public int minOperations(int[] nums, int x) {
        // using the siding window 
        // find the maximum subarray how sum is totalsum-x;
        int left=0;
        int n=nums.length;
        int target=0;
        for(int num:nums){
            target+=num;
        }
        target=target-x;
        if(target==0)return n;
        int currsum=0;
        int maxlen=Integer.MIN_VALUE;
        for(int right=0;right<n;right++){
            currsum+=nums[right];
            while(currsum>target && left<=right){
                currsum-=nums[left];
                left++;
            }
            if(currsum==target){
                maxlen=Math.max(maxlen,(right-left+1));
            }
        }
        return maxlen==Integer.MIN_VALUE?-1:n-maxlen;
        
    }
}